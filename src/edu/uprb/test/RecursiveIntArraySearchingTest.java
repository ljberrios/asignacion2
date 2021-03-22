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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.uprb.util.RecursiveIntArraySearching;

/**
 * This is a JUnit test class for the RecursiveIntArraySearching utility class.
 *
 * @author Antonio F. Huertas {@literal <antonio.huertas@upr.edu>}
 * @author Luis J. Berríos Negrón
 */
class RecursiveIntArraySearchingTest {

    /** Reference to array under test */
    private int[] arr;

    /** Creates an array for testing. */
    @BeforeEach
    void setUp() throws Exception {
        arr = new int[]{10, 20, 30, 40, 50};
    }

    /** Tests sequential searching for a value in the first half of the array. */
    @Test
    public void testSequentialSearchWhenValueIsInFirstHalfOfArray() {
        assertEquals(1, RecursiveIntArraySearching.sequentialSearch(arr, 20));
    }

    /** Tests sequential searching for a value in the second half of the array. */
    @Test
    public void testSequentialSearchWhenValueIsInSecondHalfOfArray() {
        assertEquals(4, RecursiveIntArraySearching.sequentialSearch(arr, 50));
    }

    /** Tests sequential searching for a value that's missing from the first half of the array. */
    @Test
    public void testSequentialSearchWhenValueShouldBeInFirstHalfOfArrayButIsMissing() {
        assertEquals(-1, RecursiveIntArraySearching.sequentialSearch(arr, 15));
    }

    /** Tests sequential searching for a value that's missing from the second half of the array. */
    @Test
    public void testSequentialSearchWhenValueShouldBeInSecondHalfOfArrayButIsMissing() {
        assertEquals(-1, RecursiveIntArraySearching.sequentialSearch(arr, 45));
    }

    /** Tests sequential searching for a value in the array. */
    @Test
    public void testSequentialSearch() {
        assertEquals(2, RecursiveIntArraySearching.sequentialSearch(arr, 30));
    }

    /** Tests sequential searching for a missing value in the array. */
    @Test
    public void testSequentialSearchForMissingValue() {
        assertEquals(-1, RecursiveIntArraySearching.sequentialSearch(arr, 25));
    }

    /** Tests searching for a value in the first half of the array. */
    @Test
    public void testBinarySearchForValueInFirstHalf() {
        assertEquals(1, RecursiveIntArraySearching.binarySearch(arr, 20));
    }

    /** Tests searching for a value in the last half of the array. */
    @Test
    public void testBinarySearchForValueInLastHalf() {
        assertEquals(3, RecursiveIntArraySearching.binarySearch(arr, 40));
    }

    /** Tests searching for a missing value in the first half of the array. */
    @Test
    public void testBinarySearchForMissingValueInFirstHalf() {
        assertEquals(-3, RecursiveIntArraySearching.binarySearch(arr, 25));
    }

    /** Tests searching for a missing value in the last half of the array. */
    @Test
    public void testBinarySearchForMissingValueInLastHalf() {
        assertEquals(-5, RecursiveIntArraySearching.binarySearch(arr, 45));
    }

}