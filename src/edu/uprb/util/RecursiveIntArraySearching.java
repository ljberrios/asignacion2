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
 * This class contains recursive utility methods for searching integer arrays.
 *
 * @author Antonio F. Huertas {@literal <antonio.huertas@upr.edu>}
 * @author Luis J. Berríos Negrón
 */
public final class RecursiveIntArraySearching {

    /**
     * Prevents instantiation of this class.
     */
    private RecursiveIntArraySearching() {}

    /**
     * Searches the specified array for the
     * specified key using the sequential search algorithm.
     *
     * @param arr The array to be searched
     * @param key The value to be searched for
     * @return index of the key, if found in the array; otherwise, -1
     */
    public static int sequentialSearch(int[] arr, int key) {
        return sequentialSearch(arr, key, arr.length-1);
    }

    private static int sequentialSearch(int[] arr, int key, int index) {
        if (index < 0) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        } else {
            return sequentialSearch(arr, key, index-1);
        }
    }

    /*
     * Searches the specified array for the specified key using the binary search algorithm.
     * Precondition: The array is sorted in ascending order.
     * @param arr The array to be searched
     * @param key The value to be searched for
     * @return index of the key, if it found in the array; otherwise, (-(insertion point) - 1)
     *         where the insertion point is the index at which the key should be inserted
     *         so that the array is kept sorted
     */
    public static int binarySearch(int[] arr, int key) {
        return binarySearch(arr, 0, arr.length - 1, key);
    }

    /**
     * Searches the specified array for the specified key using the binary search algorithm.
     * Precondition: The array is sorted in ascending order.
     *
     * @param arr The array to be searched
     * @param lo  The lowest index in the array
     * @param hi  The highest index in the array
     * @param key The value to be searched for
     * @return index of the key, if found in the array; otherwise, (-(insertion point) - 1)
     */
    private static int binarySearch(int[] arr, int lo, int hi, int key) {
        if (lo > hi)
            return -(lo + 1);       // key not found
        else {
            int mid = (lo + hi) / 2;
            if (key == arr[mid])
                return mid;        // key found at mid
            else if (key < arr[mid])
                return binarySearch(arr, lo, mid - 1, key);
            else // key > arr[mid]
                return binarySearch(arr, mid + 1, hi, key);
        }
    }

}