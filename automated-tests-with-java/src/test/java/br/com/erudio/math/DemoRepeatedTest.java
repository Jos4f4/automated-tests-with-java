package br.com.erudio.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class DemoRepeatedTest {
	
	SimpleMath math;
	
	@BeforeEach
	void beforeEachMethod() {
		
		System.out.println("beforeEachMethod");
		
		math = new SimpleMath();
	}

	@RepeatedTest(
		value = 3, 
		name = "{displayName}. Repetition " + "{currentRepetition} of {totalRepetitions}!"
	)
	@DisplayName("Division by Zero")
	void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(
		RepetitionInfo repetitionInfo, TestInfo testInfo
	) {
		
		System.out.println(
			"Repetition N° " + repetitionInfo.getCurrentRepetition() + " of " 
			+ repetitionInfo.getTotalRepetitions()
		);
		
		System.out.println("Running " + testInfo.getTestMethod().get().getName());
		
		// Given / Arrange	 
		double firstNumber = 6.2D;
		
		double secondNumber = 0D;
		
		var expectedMessage = "Impossible to divide by zero!";
		
	    // When / Act
	    // Then / Assert
		ArithmeticException actual = Assertions.assertThrows(
			ArithmeticException.class, 
			() -> {
				// When / Act	
			    // Then / Assert
				math.division(firstNumber, secondNumber);
			}, 
			() -> "Division by zero should throw an ArithmeticException"
		);
		
		Assertions.assertEquals(
			expectedMessage, actual.getMessage(), () -> "Unexpected exception message!"
		);
	}	
}
