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
 * This class contains recursive utility methods for integer arrays.
 *
 * @author Antonio F. Huertas {@literal <antonio.huertas@upr.edu>}
 * @author Luis J. Berríos Negrón
 */
public final class RecursiveIntArrayUtils {

    /**
     * Prevents instantiation of this class.
     */
    private RecursiveIntArrayUtils() {}

    /**
     * Count the number of times the specified
     * integer is in the specified integer array.
     *
     * @param arr The integer array
     * @param num The integer to count
     * @return The number of times the specified
     * integer is in the specified integer array
     */
    public static int count(int[] arr, int num) {
        return count(arr, num, arr.length-1);
    }

    private static int count(int[] arr, int num, int index) {
        int counter = 0;
        int len = arr.length;
        if (len == 0) {
            return 0;
        }
        if (arr[index] == num) {
            counter++;
        }

        return counter + count(copyOf(arr, len-1), num, index-1);
    }

    /**
     * Fill the specified integer array with the specified integer.
     *
     * @param arr The integer array to fill
     * @param num The integer to fill the array with
     */
    public static void fill(int[] arr, int num) {
        fill(arr, num, arr.length-1);
    }

    private static void fill(int[] arr, int num, int index) {
        if (index < 0) {
            return;
        }
        if (arr[index] != num) {
            arr[index] = num;
        }

        fill(arr, num, index-1);
    }

    /**
     * Calculates the sum of the elements of the specified array.
     * @param arr The array to be processed
     * @return The sum of the elements
     */
    public static int sum(int[] arr) {
        return sum(arr, arr.length);
    }

    private static int sum(int[] arr, int len) {
        if (len == 0)
            return 0;
        else
            return sum(arr, len - 1) + arr[len - 1];
    }

    /**
     * Determines the maximum element of the specified array.
     * @param arr The array to be processed
     * @return The maximum element
     * @throws IllegalArgumentException if the length of the array is zero
     */
    public static int maximum(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("empty array");

        return maximum(arr, arr.length);
    }

    private static int maximum(int[] arr, int len) {
        if (len == 1)
            return arr[0];
        else
            return Math.max(maximum(arr, len - 1), arr[len - 1]);
    }

    /**
     * Creates a copy of the specified array with the specified length, truncating
     * or padding with zeros so the copy has the specified length.
     * @param arr The original array to be copied
     * @param newLen The length of the copy
     * @return A copy of specified array with the specified length
     * @throws NegativeArraySizeException if the length of the copy is negative
     */
    public static int[] copyOf(int[] arr, int newLen) {
        if (newLen < 0)
            throw new NegativeArraySizeException("negative size: " + newLen);

        int[] copy = new int[newLen];
        if (arr.length < newLen)
            newLen = arr.length;

        arrCopy(arr, newLen, copy);
        return copy;
    }

    private static void arrCopy(int[] arr, int len, int[] newArr) {
        if (len != 0) {
            arrCopy(arr, len - 1, newArr);
            newArr[len - 1] = arr[len - 1];
        }
    }

    /**
     * Returns the string representation of the specified array as a list of
     * the elements enclosed in brackets.
     * @param arr The array to be examined
     * @return The string representation of the specified array
     */
    public static String toString(int[] arr) {
        StringBuilder str = new StringBuilder("[");
        arrToString(arr, arr.length, str);
        return str.append("]").toString();
    }

    private static void arrToString(int[] arr, int len, StringBuilder str) {
        if (len != 0) {
            arrToString(arr, len - 1, str);
            if (len > 1)
                str.append(", ");
            str.append(arr[len - 1]);
        }
    }

}