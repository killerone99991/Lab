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
 * This class provides methods to input a string, count the occurrences of 
 * each letter in the string, and display the results in a formatted manner.
 *
 * @author Tran Hieu Nghia - CE191122
 */
public class MyString {

    private String input; // The input string provided by the user
    private ArrayList<Integer> array; // Stores the count of each letter ('a' to 'z')
    private char letter; // Placeholder for individual letters during processing
    Scanner scanner = new Scanner(System.in); // Scanner object for user input

    /**
     * Default constructor for the MyString class.
     */
    public MyString() {
    }

    /**
     * Reads and validates the input string from the user.
     * Ensures that the input contains at least one alphabetic letter.
     *
     * @return The validated input string.
     */
    public String inputString() {
        input = scanner.nextLine(); // Read the input string
        Handle.validLetter(input); // Validate that the input contains letters
        return input; // Return the validated string
    }

    /**
     * Counts the occurrences of each letter ('a' to 'z') in the input string.
     * Non-letter characters are ignored during the counting process.
     *
     * @return An ArrayList of integers where each index corresponds to a letter
     * ('a' -> index 0, 'b' -> index 1, ..., 'z' -> index 25) and the value at
     * each index is the count of that letter.
     */
    public ArrayList<Integer> countLetters() {
        array = new ArrayList<>(); // Initialize the array to store letter counts

        // Initialize ArrayList with 26 zeros (for letters 'a' to 'z')
        for (int i = 0; i < 26; i++) {
            array.add(0);
        }

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Check if the character is a letter
                char lowerC = Character.toLowerCase(c); // Convert to lowercase
                int index = lowerC - 'a'; // Calculate the index (0 for 'a', 1 for 'b', etc.)
                array.set(index, array.get(index) + 1); // Increment the count at the corresponding index
            }
        }

        return array; // Return the array with letter counts
    }

    /**
     * Generates a formatted string representation of the letter counts.
     * Only includes letters with non-zero counts.
     *
     * @return A formatted string listing the letters and their counts.
     */
    @Override
    public String toString() {
        StringBuilder stringArray = new StringBuilder(); // StringBuilder for efficient string concatenation

        // Iterate through the counts array and construct the result string
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > 0) { // Only include letters with non-zero counts
                char letter = (char) (i + 'a'); // Convert index to corresponding letter
                stringArray.append("        ").append(letter).append(": ").append(array.get(i)).append("\n");
            }
        }
        return stringArray.toString(); // Return the formatted result string
    }
}
