/**
 * University of Puerto Rico at Bayamon
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2021
 * Luis J. Berríos Negrón
 * 802-18-1607
 * luis.berrios17@upr.edu
 */


package edu.uprb.app;

import edu.uprb.util.IntArrayShuffling;

import java.util.Arrays;

/**
 *
 *
 * @author Luis J. Berríos Negrón
 */
public class IntArrayShufflingDemoApp {

    public static void main(String[] args) {
        int[] sortedArr = {1, 2, 3, 4, 5};
        IntArrayShuffling.shuffle(sortedArr);

        System.out.println(Arrays.toString(sortedArr));

        System.exit(0);
    }

}
