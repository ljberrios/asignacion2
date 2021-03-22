/**
 * University of Puerto Rico at Bayamon
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2021
 * Luis J. Berríos Negrón
 * 802-18-1607
 * luis.berrios17@upr.edu
 */

package edu.uprb.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.uprb.util.RecursiveIntegerUtils;

/**
 * This is a JUnit test class for the RecursiveIntegerUtils class.
 *
 * @author Antonio F. Huertas {@literal <antonio.huertas@upr.edu>}
 * @author Luis J. Berríos Negrón
 */
class RecursiveIntegerUtilsTest {

    /** Tests the Nth term of the fibonacci
     * sequence when N is positive is computed as expected */
    @Test
    public void testFindNthTermOfFibonacciSequenceWhenNisPositive() {
        int n = 12;
        long nthTerm = RecursiveIntegerUtils.fibonacci(n);
        Assertions.assertEquals(144, nthTerm);
    }

    /** Tests the Nth term of the fibonacci
     * sequence when N is negative cannot be computed */
    @Test
    public void testFindNthTermOfFibonacciSequenceWhenNisNegative() {
        try {
            int n = -12;
            long nthTerm = RecursiveIntegerUtils.fibonacci(n);
            Assertions.fail("Test failure with invalid index: -12");
        } catch (IllegalArgumentException ex) {
            Assertions.assertEquals("negative integer: -12", ex.getMessage());
        }
    }

    /** Tests the zeroth term of the
     * fibonacci sequence is computed as expected */
    @Test
    public void testFindNthTermOfFibonacciSequenceWhenNisZero() {
        int n = 0;
        long nthTerm = RecursiveIntegerUtils.fibonacci(n);
        Assertions.assertEquals(0, nthTerm);
    }

    /** Tests a positive number elevated to the
     * power of a positive number is computed as expected */
    @Test
    public void testFindNthPowerOfBaseWhenNisPositive() {
        int base = 2;
        int exponent = 5;
        int value = RecursiveIntegerUtils.power(base, exponent);
        Assertions.assertEquals(32, value);
    }

    /** Tests a positive number elevated to the
     * power of a negative number cannot be computed */
    @Test
    public void testFindNthPowerOfBaseWhenNisNegative() {
        try {
            int base = 2;
            int exponent = -5;
            int value = RecursiveIntegerUtils.power(base, exponent);
            Assertions.fail("Test failure with invalid exponent: -2");
        } catch (IllegalArgumentException ex) {
            Assertions.assertEquals("negative integer: -5", ex.getMessage());
        }
    }

    /** Tests a positive number elevated to the
     * power of zero is computed as expected */
    @Test
    public void testFindNthPowerOfBaseWhenNisZero() {
        int base = 2;
        int exponent = 0;
        int value = RecursiveIntegerUtils.power(base, exponent);
        Assertions.assertEquals(1, value);
    }

    /** Tests the sum up to a positive number is computed as expected. */
    @Test
    public void testSumForPositive() {
        assertEquals(15, RecursiveIntegerUtils.sumUpTo(5));
    }

    /** Tests the sum up to zero is zero. */
    @Test
    public void testSumForZero() {
        assertEquals(0, RecursiveIntegerUtils.sumUpTo(0));
    }

    /** Tests the sum up to a negative number cannot be computed. */
    @Test
    public void testSumForNegative() {
        try {
            RecursiveIntegerUtils.sumUpTo(-5);
            fail("Test failure with negative integer: -5");
        } catch (IllegalArgumentException ex) {
            assertEquals("negative integer: -5", ex.getMessage());
        }
    }

    /** Tests the factorial of a positive number is computed as expected. */
    @Test
    public void testFactorialForPositive() {
        assertEquals(120, RecursiveIntegerUtils.factorial(5));
    }

    /** Tests the factorial of zero is zero. */
    @Test
    public void testFactorialForZero() {
        assertEquals(1, RecursiveIntegerUtils.factorial(0));
    }

    /** Tests the factorial of a negative number cannot be computed. */
    @Test
    public void testFactorialForNegative() {
        try {
            RecursiveIntegerUtils.factorial(-5);
            fail("Test failure with negative integer: -5");
        } catch (IllegalArgumentException ex) {
            assertEquals("negative integer: -5", ex.getMessage());
        }
    }

    /** Tests the greatest common divisor of two numbers is computed as expected
     *  when the second number is positive. */
    @Test
    public void testGcdForSecondPositive() {
        assertEquals(4, RecursiveIntegerUtils.gcd(12, 8));
    }

    /** Tests the greatest common divisor of two numbers is computed as expected
     *  when the second number is zero. */
    @Test
    public void testGcdForSecondZero() {
        assertEquals(12, RecursiveIntegerUtils.gcd(12, 0));
    }

    /** Tests the greatest common divisor of two numbers is computed as expected
     *  when the second number is negative. */
    @Test
    public void testGcdForSecondNegative() {
        try {
            RecursiveIntegerUtils.gcd(12, -8);
            fail("Test failure with negative integer: -8");
        } catch (IllegalArgumentException ex) {
            assertEquals("negative integer: -8", ex.getMessage());
        }
    }

    /** Tests the greatest common divisor of two numbers is computed as expected
     *  when the first number is negative. */
    @Test
    public void testGcdForFirstNegative() {
        try {
            RecursiveIntegerUtils.gcd(-12, 8);
            fail("Test failure with negative integer: -12");
        } catch (IllegalArgumentException ex) {
            assertEquals("negative integer: -12", ex.getMessage());
        }
    }


}