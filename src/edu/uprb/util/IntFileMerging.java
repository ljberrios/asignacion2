/**
 * University of Puerto Rico at Bayamon
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2021
 * Luis J. Berríos Negrón
 * 802-18-1607
 * luis.berrios17@upr.edu
 */


package edu.uprb.util;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Utilities for merging files containing integers.
 *
 * @author Luis J. Berríos Negrón
 */
public final class IntFileMerging {

    private IntFileMerging() { }

    /**
     * Merge two files containing integers into a third file.
     *
     * @param fileIn1 The scanner of the first file
     * @param fileIn2 The scanner of the second file
     * @param fileOut The writer of the third file
     */
    public static void merge(Scanner fileIn1,
                             Scanner fileIn2,
                             PrintWriter fileOut)
    {
        // wait until first scanner is done
        if (fileIn1.hasNextInt()) {
            fileOut.print(fileIn1.nextInt() + " ");
        } else {
            // start second scanner after the first is done
            if (fileIn2.hasNextInt()) {
                fileOut.print(fileIn2.nextInt() + " ");
            } else {
                // once both scanners are done, we're done
                return;
            }
        }
        merge(fileIn1, fileIn2, fileOut);
    }

}
