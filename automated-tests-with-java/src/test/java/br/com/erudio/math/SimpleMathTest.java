package br.com.erudio.math;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in Simple Math Class")
class SimpleMathTest {
	
	SimpleMath math;
	
	@BeforeAll
	static void setup() {
		
		System.out.println("Running @BeforeAll method!");
	}
	
	@AfterAll
	static void cleanup() {
		
		System.out.println("Running @AfterAll method!");
	}
	
	@BeforeEach
	void beforeEachMethod() {
		
		System.out.println("Running @BeforeEach method!");
		
		math = new SimpleMath();
	}
	
	@AfterEach
	void afterEachMethod() {
		
		System.out.println("Running @AfterEach method!");
	}
	
	
	// test[System Under Test]_[Condition or State Change]_[Expected Result]
	
	@Test
	@DisplayName("Test 6.2 + 2 = 8.2")
	void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
		
		// Given / Arrange		
		double firstNumber = 6.2D;
		
		double secondNumber = 2D;
		
		Double expected = 8.2D;
		
		// When / Act
		Double actual = math.sum(firstNumber, secondNumber);
		
		// Then / Assert
		Assertions.assertEquals(
			expected, 
			actual, 
		
			// If assert is False
			() -> firstNumber + " + " + secondNumber + 
			" did not produce " + expected + "!"
		);
	}

	@Test
	@DisplayName("Test 6.2 - 2 = 4.2")
	void testSubtraction_When_SixDotTwoIsSubtractedByTwo_ShouldReturnFourDotTwo() {
		
		// Given / Arrange		
		double firstNumber = 6.2D;
		
		double secondNumber = 2D;
		
		Double expected = 4.2D;
		
		// When / Act
		Double actual = math.subtraction(firstNumber, secondNumber);
		
		// Then / Assert
		Assertions.assertEquals(
			expected, 
			actual, 
			
			// If assert is False
			() -> firstNumber + " - " + secondNumber + 
			" did not produce " + expected + "!"
		);
	}
	
	@Test
	@DisplayName("Test 6.2 * 2 = 12.4")
	void testMultiplication_When_SixDotTwoIsMultipliedByTwo_ShouldReturnTwelveDotFour() {
		
		// Given / Arrange
		double firstNumber = 6.2D;
		
		double secondNumber = 2D;
		
		Double expected = 12.4D;
		
		// When / Act
		Double actual = math.multiplication(firstNumber, secondNumber);
		
		// Then / Assert
		Assertions.assertEquals(
			expected, 
			actual, 
				
			// If assert is False
			() -> firstNumber + " * " + secondNumber + 
			" did not produce " + expected + "!"
		);
	}
	
	@Test
	@DisplayName("Test 6.2 / 2 = 3.1")
	void testDivision_When_SixDotTwoIsDividedByTwo_ShouldReturnThreeDotOne() {
		
		// Given / Arrange		
		double firstNumber = 6.2D;
		
		double secondNumber = 2D;
		
		Double expected = 3.1D;
		
		// When / Act
		Double actual = math.division(firstNumber, secondNumber);
		
		// Then / Assert		
		Assertions.assertEquals(
			expected, 
			actual, 
			
			// If assert is False
			() -> firstNumber + " / " + secondNumber + 
			" did not produce " + expected + "!"
		);
	}
	
	// @Disabled("TODO: We need still work on it!") // Not recommended
	@Test
	@DisplayName("Division by Zero")
	void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
		
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
	
	@Test
	@DisplayName("Test (6.2 + 2) / 2 = 4.1")
	void testMean_When_SixDotTwoAddedTwoAndDividedByTwo_ShouldReturnFourDotOne() {
		
		// Given / Arrange		
		double firstNumber = 6.2D;
		
		double secondNumber = 2D;
		
		Double expected = 4.1D; 
		
		// When / Act
		Double actual = math.mean(firstNumber, secondNumber);
		
		// Then / Assert		
		Assertions.assertEquals(
			expected, 
			actual, 
		
			// If assert is False
			() -> "(" + firstNumber + " + " + secondNumber + ") / 2" +
			" did not produce " + expected + "!"
		);
	}
	
	@Test
	@DisplayName("Test Square Root of 81 = 9")
	void testSquareRoot_When_SquareRootOfEightyOne_ShouldReturnNine() {
		
		// Given / Arrange		
		double number = 81D;
		
		Double expected = 9D;
		
		// When / Act
		Double actual = math.squareRoot(number);
		
		// Then / Assert
		Assertions.assertEquals(
			expected, 
			actual, 
		
			// If assert is False
			() -> "Square Root of " + number + "did not produce " + expected + "!"
		);
	}
}