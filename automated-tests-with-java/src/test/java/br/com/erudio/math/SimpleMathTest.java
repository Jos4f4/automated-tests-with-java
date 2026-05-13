package br.com.erudio.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in Simple Math Class")
class SimpleMathTest {
	
	// test[System Under Test]_[Condition or State Change]_[Expected Result]
	
	@Test
	@DisplayName("Test 6.2 + 2 = 8.2")
	void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
		
		// Given / Arrange
		SimpleMath math = new SimpleMath();
		
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
		SimpleMath math = new SimpleMath();
		
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
		SimpleMath math = new SimpleMath();
		
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
		SimpleMath math = new SimpleMath();
		
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
	
	@Test
	void testDivision_ByZero_ShouldReturnArithmeticException() {
		
		// Given / Arrange
	    SimpleMath math = new SimpleMath();
	    
	    // When / Act
	    ArithmeticException exception = Assertions.assertThrows(
	        ArithmeticException.class, 
	        () -> math.division(6.2, 0.0)
	    );
	    
	    // Then / Assert	
	    Assertions.assertEquals("Division by zero!", exception.getMessage());
	}
	
	@Test
	@DisplayName("Test (6.2 + 2) / 2 = 4.1")
	void testMean_When_SixDotTwoAddedTwoAndDividedByTwo_ShouldReturnFourDotOne() {
		
		// Given / Arrange
		SimpleMath math = new SimpleMath();
		
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
		SimpleMath math = new SimpleMath();
		
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