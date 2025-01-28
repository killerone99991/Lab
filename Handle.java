/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * S05 - Count the number of the appearance of letters in a string.
 *
 * This class provides utilities for validating and handling string inputs.
 *
 * @author Tran Hieu Nghia - CE191122
 */
public class Handle {

    // Scanner object for reading user input
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Default constructor for the Handle class.
     * This class does not require any instance-specific initialization.
     */
    public Handle() {
    }

    /**
     * Validates and ensures the input contains at least one alphabetic letter.
     * If the input does not contain a letter, the user will be prompted to
     * re-enter until a valid input is provided.
     *
     * @param size The input string to be validated.
     * @return A valid input string containing at least one alphabetic letter.
     */
    public static String validLetter(String size) {
        do {
            // Check if the input contains at least one alphabetic character
            if (!size.matches(".*[a-zA-Z].*")) {
                // Prompt the user to enter a valid string with letters
                System.out.print("Please enter a string with at least one letter: ");
                size = scanner.nextLine(); // Read the new input
            }
        } while (!size.matches(".*[a-zA-Z].*")); // Repeat until the input is valid
        return size; // Return the validated input
    }
}
