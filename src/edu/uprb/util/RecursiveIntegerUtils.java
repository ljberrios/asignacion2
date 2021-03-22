/**
 * University of Puerto Rico at Bayamon
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2021
 * Luis J. Berríos Negrón
 * 802-18-1607
 * luis.berrios17@upr.edu
 */

package edu.uprb.util;

/**
 * This class contains recursive utility methods for integers.
 *
 * @author Antonio F. Huertas {@literal <antonio.huertas@upr.edu>}
 * @author Luis J. Berríos Negrón
 */
public final class RecursiveIntegerUtils {

    /**
     * Prevents instantiation of this class.
     */
    private RecursiveIntegerUtils() {}

    /**
     * Find the Nth term in the fibonacci sequence.
     *
     * @param num The index (or N)
     * @return The Nth term
     */
    public static long fibonacci(int num) {
        checkNotNegative(num);
        switch (num) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            default:
                return fibonacci(num-1) + fibonacci(num-2);
        }
    }

    /**
     * Compute the Nth power of the specified base.
     *
     * @param base The base
     * @param exponent The exponent (or N)
     * @return the base to the power of the specified exponent
     */
    public static int power(int base, int exponent) {
        checkNotNegative(exponent);
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent-1);
        }
    }

    /**
     * Returns the sum up to the specified non-negative integer.
     * @param num The integer that serves as the upper limit
     * @return The sum up to the specified non-negative integer
     * @throws IllegalArgumentException if the integer is negative
     */
    public static int sumUpTo(int num) {
        checkNotNegative(num);
        return sumHelper(num);
    }

    private static int sumHelper(int num) {
        if (num == 0)
            return 0;
        else
            return num + sumHelper(num - 1);
    }

    /**
     * Returns the factorial of the specified non-negative integer.
     * @param num The integer that serves as the upper limit
     * @return The factorial of the specified non-negative integer
     * @throws IllegalArgumentException if the integer is negative
     */
    public static long factorial(int num) {
        checkNotNegative(num);
        return factorialHelper(num);
    }

    private static long factorialHelper(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorialHelper(num - 1);
    }

    /**
     * Returns the greatest common divisor for the two specified non-negative integers.
     * @param first The first non-negative integer
     * @param second The second non-negative integer
     * @return The greatest common divisor for two non-negative integers
     * @throws IllegalArgumentException if either integer is negative
     */
    public static int gcd(int first, int second) {
        checkNotNegative(first);
        checkNotNegative(second);
        return gcdHelper(first, second);
    }

    public static int gcdHelper(int first, int second) {
        if (second == 0)
            return first;
        else
            return gcdHelper(second, first % second);
    }

    /**
     * Checks that the specified integer is not negative.
     * @param num The integer that is checked.
     * @throws IllegalArgumentException if the integer is negative
     */
    private static void checkNotNegative(int num) {
        if (num < 0)
            throw new IllegalArgumentException("negative integer: " + num);
    }

}