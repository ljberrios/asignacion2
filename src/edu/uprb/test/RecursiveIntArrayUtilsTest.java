/**
 * University of Puerto Rico at Bayamon
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2021
 * Luis J. Berríos Negrón
 * 802-18-1607
 * luis.berrios17@upr.edu
 */

package edu.uprb.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.uprb.util.RecursiveIntArrayUtils;

/**
 * This is a JUnit test class for the RecursiveIntArrayUtils class.
 *
 * @author Antonio F. Huertas {@literal <antonio.huertas@upr.edu>}
 * @author Luis J. Berríos Negrón
 */
class RecursiveIntArrayUtilsTest {

    /** Reference to array under test */
    private int[] arr;

    /** Creates an array for testing. */
    @BeforeEach
    void setUp() throws Exception {
        arr = new int[]{60, 50, 10, 30};
    }

    /** Tests the number of times a number is inside an array, when
     * the array doesn't contain the number, is computed as expected */
    @Test
    void testCountNumberOfTimesNisInIntArrayWhenArrayDoesntContainN() {
        int[] arr = {1, 1, 1, 1};
        int n = 2;
        int count = RecursiveIntArrayUtils.count(arr, n);
        Assertions.assertEquals(0, count);
    }

    /** Tests the number of times a number is inside an array, when
     * the array contains the number once, is computed as expected */
    @Test
    void testCountNumberOfTimesNisInIntArrayWhenArrayContainsNOnce() {
        int[] arr = {1, 1, 1, 2};
        int n = 2;
        int count = RecursiveIntArrayUtils.count(arr, n);
        Assertions.assertEquals(1, count);
    }

    /** Tests the number of times a number is inside an array, when
     * the array contains the number more than once, is computed as expected */
    @Test
    void testCountNumberOfTimesNisInIntArrayWhenArrayContainsNMultipleTimes() {
        int[] arr = {1, 2, 2, 2};
        int n = 2;
        int count = RecursiveIntArrayUtils.count(arr, n);
        Assertions.assertEquals(3, count);
    }

    /** Tests filling an array with a number
     * when the length of the array is higher than one */
    @Test
    void testFillArrayWithNWhenArrayLengthIsHigherThanOne() {
        int[] arr = new int[3];
        int n = 1;
        RecursiveIntArrayUtils.fill(arr, n);
        Assertions.assertArrayEquals(new int[]{1, 1, 1}, arr);
    }

    /** Tests filling an array with a number
     * when the length of the array is one */
    @Test
    void testFillArrayWithNWhenArrayLengthIsOne() {
        int[] arr = new int[1];
        int n = 1;
        RecursiveIntArrayUtils.fill(arr, n);
        Assertions.assertArrayEquals(new int[]{1}, arr);
    }

    /** Tests filling an array with a number
     * when the length of the array is zero */
    @Test
    void testFillArrayWithNWhenArrayLengthIsZero() {
        int[] arr = new int[0];
        int n = 1;
        RecursiveIntArrayUtils.fill(arr, n);
        Assertions.assertArrayEquals(new int[0], arr);
    }

    /** Tests the sum of a non-empty array is computed as expected. */
    @Test
    public void testSum() {
        assertEquals(150, RecursiveIntArrayUtils.sum(arr));
    }

    /** Tests the sum of a single-value array is the sole element. */
    @Test
    public void testSumForSingleValue() {
        assertEquals(5, RecursiveIntArrayUtils.sum(new int[]{5}));
    }

    /** Tests the sum of an empty array is zero. */
    @Test
    public void testSumForEmpty() {
        assertEquals(0, RecursiveIntArrayUtils.sum(new int[0]));
    }

    /** Tests the maximum element of a non-empty array is computed as expected. */
    @Test
    public void testMaximum() {
        assertEquals(60, RecursiveIntArrayUtils.maximum(arr));
    }

    /** Tests the maximum element of a single-value array is the sole element. */
    @Test
    public void testMaximumForSingleValue() {
        assertEquals(5, RecursiveIntArrayUtils.maximum(new int[]{5}));
    }

    /** Tests the maximum element of an empty array cannot be computed. */
    @Test
    public void testMaximumForEmpty() {
        try {
            RecursiveIntArrayUtils.maximum(new int[0]);
            fail("Test failure for empty array");
        } catch (IllegalArgumentException ex) {
            assertEquals("empty array", ex.getMessage());
        }
    }

    /** Tests a full copy of an array can be created. */
    @Test
    public void testFullCopy() {
        assertArrayEquals(new int[]{60, 50, 10, 30},
                RecursiveIntArrayUtils.copyOf(arr, arr.length));
    }

    /** Tests a copy with padding of an array can be created. */
    @Test
    public void testCopyWithPadding() {
        assertArrayEquals(new int[]{60, 50, 10, 30, 0, 0, 0, 0, 0, 0},
                RecursiveIntArrayUtils.copyOf(arr, 10));
    }

    /** Tests a partial copy of an array can be created. */
    @Test
    public void testPartialCopy() {
        assertArrayEquals(new int[]{60, 50, 10},
                RecursiveIntArrayUtils.copyOf(arr, 3));
    }

    /** Tests an empty copy of an array can be created. */
    @Test
    public void testEmptyCopy() {
        assertArrayEquals(new int[0], RecursiveIntArrayUtils.copyOf(arr, 0));
    }

    /** Tests a copy with a negative length cannot be created. */
    @Test
    public void testCopyWithNegativeLength() {
        try {
            RecursiveIntArrayUtils.copyOf(arr, -5);
            fail("Test failure for empty array");
        } catch (NegativeArraySizeException ex) {
            assertEquals("negative size: -5", ex.getMessage());
        }
    }

    /** Tests a non-empty array has the expected string representation. */
    @Test
    public void testToString() {
        assertEquals("[60, 50, 10, 30]",
                RecursiveIntArrayUtils.toString(arr));
    }

    /** Tests a single-value array has the expected string representation. */
    @Test
    public void testToStringForSingleValue() {
        assertEquals("[50]", RecursiveIntArrayUtils.toString(new int[]{50}));
    }

    /** Tests an empty array has the expected string representation. */
    @Test
    public void testToStringForEmpty() {
        assertEquals("[]", RecursiveIntArrayUtils.toString(new int[0]));
    }

}