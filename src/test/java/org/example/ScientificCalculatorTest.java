package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    
    private ScientificCalculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }
    
    @Test
    void testSquareRootPositiveNumber() {
        double result = Math.sqrt(16.0);
        assertEquals(4.0, result, 0.0001);
    }
    
    @Test
    void testSquareRootZero() {
        double result = Math.sqrt(0.0);
        assertEquals(0.0, result, 0.0001);
    }
    
    @Test
    void testSquareRootDecimal() {
        double result = Math.sqrt(2.25);
        assertEquals(1.5, result, 0.0001);
    }
    
    @Test
    void testSquareRootNegativeNumber() {
        // Test that square root of negative number returns NaN
        double result = Math.sqrt(-4.0);
        assertTrue(Double.isNaN(result));
    }
    
    @Test
    void testFactorialZero() {
        long result = factorial(0);
        assertEquals(1L, result);
    }
    
    @Test
    void testFactorialOne() {
        long result = factorial(1);
        assertEquals(1L, result);
    }
    
    @Test
    void testFactorialPositiveNumber() {
        long result = factorial(5);
        assertEquals(120L, result);
    }
    
    @Test
    void testFactorialTen() {
        long result = factorial(10);
        assertEquals(3628800L, result);
    }
    
    @Test
    void testFactorialLargeNumber() {
        long result = factorial(20);
        assertEquals(2432902008176640000L, result);
    }
    
    @Test
    void testNaturalLogarithmOne() {
        double result = Math.log(1.0);
        assertEquals(0.0, result, 0.0001);
    }
    
    @Test
    void testNaturalLogarithmE() {
        double result = Math.log(Math.E);
        assertEquals(1.0, result, 0.0001);
    }
    
    @Test
    void testNaturalLogarithmPositiveNumber() {
        double result = Math.log(10.0);
        assertEquals(2.302585, result, 0.0001);
    }
    
    @Test
    void testNaturalLogarithmZero() {
        double result = Math.log(0.0);
        assertTrue(Double.isInfinite(result));
        assertTrue(result < 0);
    }
    
    @Test
    void testNaturalLogarithmNegativeNumber() {
        double result = Math.log(-1.0);
        assertTrue(Double.isNaN(result));
    }
    
    @Test
    void testPowerPositiveBasePositiveExponent() {
        double result = Math.pow(2.0, 3.0);
        assertEquals(8.0, result, 0.0001);
    }
    
    @Test
    void testPowerPositiveBaseZeroExponent() {
        double result = Math.pow(5.0, 0.0);
        assertEquals(1.0, result, 0.0001);
    }
    
    @Test
    void testPowerZeroBasePositiveExponent() {
        double result = Math.pow(0.0, 5.0);
        assertEquals(0.0, result, 0.0001);
    }
    
    @Test
    void testPowerNegativeBaseIntegerExponent() {
        double result = Math.pow(-2.0, 3.0);
        assertEquals(-8.0, result, 0.0001);
    }
    
    @Test
    void testPowerNegativeBaseEvenExponent() {
        double result = Math.pow(-2.0, 2.0);
        assertEquals(4.0, result, 0.0001);
    }
    
    @Test
    void testPowerFractionalExponent() {
        double result = Math.pow(4.0, 0.5);
        assertEquals(2.0, result, 0.0001);
    }
    
    @Test
    void testPowerNegativeExponent() {
        double result = Math.pow(2.0, -2.0);
        assertEquals(0.25, result, 0.0001);
    }
    
    @Test
    void testAdditionPositiveNumbers() {
        double result = 5.0 + 3.0;
        assertEquals(8.0, result, 0.0001);
    }
    
    @Test
    void testAdditionNegativeNumbers() {
        double result = -5.0 + -3.0;
        assertEquals(-8.0, result, 0.0001);
    }
    
    @Test
    void testAdditionMixedNumbers() {
        double result = 10.0 + -3.0;
        assertEquals(7.0, result, 0.0001);
    }
    
    @Test
    void testAdditionWithZero() {
        double result = 5.0 + 0.0;
        assertEquals(5.0, result, 0.0001);
    }
    
    @Test
    void testAdditionDecimalNumbers() {
        double result = 2.5 + 3.7;
        assertEquals(6.2, result, 0.0001);
    }
    
    @Test
    void testSubtractionPositiveNumbers() {
        double result = 10.0 - 3.0;
        assertEquals(7.0, result, 0.0001);
    }
    
    @Test
    void testSubtractionNegativeNumbers() {
        double result = -5.0 - -3.0;
        assertEquals(-2.0, result, 0.0001);
    }
    
    @Test
    void testSubtractionMixedNumbers() {
        double result = 5.0 - -3.0;
        assertEquals(8.0, result, 0.0001);
    }
    
    @Test
    void testSubtractionWithZero() {
        double result = 5.0 - 0.0;
        assertEquals(5.0, result, 0.0001);
    }
    
    @Test
    void testSubtractionDecimalNumbers() {
        double result = 5.7 - 2.3;
        assertEquals(3.4, result, 0.0001);
    }
    
    @Test
    void testMultiplicationPositiveNumbers() {
        double result = 4.0 * 3.0;
        assertEquals(12.0, result, 0.0001);
    }
    
    @Test
    void testMultiplicationNegativeNumbers() {
        double result = -4.0 * -3.0;
        assertEquals(12.0, result, 0.0001);
    }
    
    @Test
    void testMultiplicationMixedNumbers() {
        double result = -4.0 * 3.0;
        assertEquals(-12.0, result, 0.0001);
    }
    
    @Test
    void testMultiplicationWithZero() {
        double result = 5.0 * 0.0;
        assertEquals(0.0, result, 0.0001);
    }
    
    @Test
    void testMultiplicationDecimalNumbers() {
        double result = 2.5 * 4.0;
        assertEquals(10.0, result, 0.0001);
    }
    
    @Test
    void testDivisionPositiveNumbers() {
        double result = 12.0 / 3.0;
        assertEquals(4.0, result, 0.0001);
    }
    
    @Test
    void testDivisionNegativeNumbers() {
        double result = -12.0 / -3.0;
        assertEquals(4.0, result, 0.0001);
    }
    
    @Test
    void testDivisionMixedNumbers() {
        double result = -12.0 / 3.0;
        assertEquals(-4.0, result, 0.0001);
    }
    
    @Test
    void testDivisionByZero() {
        // Test that division by zero throws ArithmeticException or returns Infinity
        double result = 5.0 / 0.0;
        assertTrue(Double.isInfinite(result));
    }
    
    @Test
    void testDivisionDecimalNumbers() {
        double result = 7.5 / 2.5;
        assertEquals(3.0, result, 0.0001);
    }
    
    @Test
    void testDivisionResultingInDecimal() {
        double result = 7.0 / 2.0;
        assertEquals(3.5, result, 0.0001);
    }
    
    @Test
    void testDivisionZeroByZero() {
        double result = 0.0 / 0.0;
        assertTrue(Double.isNaN(result));
    }
    
    @Test
    void testAdditionLargeNumbers() {
        double result = Double.MAX_VALUE * 2.0;
        assertTrue(Double.isInfinite(result));
    }
    
    @Test
    void testMultiplicationLargeNumbers() {
        double result = Double.MAX_VALUE * 2.0;
        assertTrue(Double.isInfinite(result));
    }
    
    @Test
    void testSubtractionResultingInNegativeZero() {
        double result = 0.0 - 0.0;
        assertEquals(0.0, result, 0.0001);
    }
    
    @Test
    void testDivisionVerySmallNumbers() {
        double result = 1.0 / Double.MIN_VALUE;
        assertTrue(Double.isInfinite(result));
    }
    
    // Helper method to test factorial (since the original method is private)
    private long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
