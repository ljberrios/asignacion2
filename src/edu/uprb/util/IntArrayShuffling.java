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
 * Integer array shuffling utilities.
 *
 * @author Luis J. Berríos Negrón
 */
public final class IntArrayShuffling {

    private IntArrayShuffling() {}

    /**
     * Shuffle the elements inside the given integer array.
     *
     * @param arr The integer array to shuffle
     */
    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomIdx = pickRandomNumberFromRange(i, arr.length - 1);
            if (randomIdx != i) {
                int temp = arr[i];
                arr[i] = arr[randomIdx];
                arr[randomIdx] = temp;
            }
        }
    }

    private static int pickRandomNumberFromRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

}
