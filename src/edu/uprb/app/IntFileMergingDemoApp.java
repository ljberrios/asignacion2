/**
 * University of Puerto Rico at Bayamon
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2021
 * Luis J. Berríos Negrón
 * 802-18-1607
 * luis.berrios17@upr.edu
 */


package edu.uprb.app;

import edu.uprb.util.IntFileMerging;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 *
 * @author Luis J. Berríos Negrón
 */
public class IntFileMergingDemoApp {

    public static void main(String[] args) throws IOException {
        File first = new File("SortedNumbersOne.txt");
        File second = new File("SortedNumbersTwo.txt");

        File result = new File("MergedSortedNumbers.txt");
        if (result.exists()) {
            result.delete();
        }
        result.createNewFile();

        Scanner firstScanner = new Scanner(first);
        Scanner secondScanner = new Scanner(second);
        PrintWriter writer = new PrintWriter(result);

        IntFileMerging.merge(firstScanner, secondScanner, writer);

        firstScanner.close();
        secondScanner.close();
        writer.close();

        System.exit(0);
    }

}
