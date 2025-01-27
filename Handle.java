/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * S01 - Program to insert new element into an existing array
 *
 * @author Tran Hieu Nghia - CE191122
 */
public class Handle {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Default constructor for the Handle class.
     */
    public Handle() {
    }

    /**
     * Validates and returns a valid size input from the user.
     * Ensures that the input is a positive integer.
     *
     * @param size A placeholder for the input size string.
     * @return A valid size string, trimmed and formatted.
     */
    public static String validSize(String size) {
        do {
            // Read input from the user
            size = scanner.nextLine();
            // Check if the input matches a positive integer
            if (!size.matches("^\\s*\\d+\\s*$")) {
                System.out.print("Please enter positive integer number: ");
            }
        } while (!size.matches("^\\s*\\d+\\s*$")); // Repeat until input is valid
        return size.trim(); // Return the trimmed valid size
    }

    /**
     * Validates and returns a valid array element input from the user.
     * Ensures that the input is a positive integer.
     *
     * @param m A placeholder for the element input.
     * @param numberOnly A placeholder for the validated number.
     * @return A valid element string, trimmed and formatted.
     */
    public static String validElement(String m, String numberOnly) {
        do {
            // Read input from the user
            m = scanner.nextLine();
            // Check if the input matches a positive integer
            if (!m.matches("^\\s*\\d+\\s*$")) {
                System.out.print("Please enter positive integer number: ");
            }
        } while (!m.matches("^\\s*\\d+\\s*$")); // Repeat until input is valid
        return m.trim(); // Return the trimmed valid element
    }

    /**
     * Adjusts values in an array to ensure only integer values are stored.
     * Converts floating-point numbers to integers where applicable.
     *
     * @param array The array of integers to be adjusted.
     */
    public static void handleInteger(ArrayList<Integer> array) {
        for (double value : array) {
            // Check if the value is a whole number
            if (value == (int) value) {
                value = (int) value; // Cast to integer
            }
        }
    }
}