/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S01;

import java.util.Scanner;

/**
 * S01 - Program to insert a new element into an existing array.
 *
 * This program allows the user to input an array, sort it, and then insert a
 * new element into the array while maintaining the sorted order.
 *
 * @author Tran Hieu Nghia - CE191122
 */
public class S01 {

    /**
     * The main method serves as the entry point for the program. It handles
     * user input and manages the flow of the program to perform array
     * operations.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an Array object to perform array operations
        Array array = new Array();

        // Input the initial array from the user
        array.inputArray();

        // Display the sorted array
        array.sortArray(); // Sort the array

        array.displayArray(); // Display the sorted array

        // Insert the new element into the array
        array.insertElement();

        // Display the array after the insertion
        System.out.println("New array: ");
        array.displayArray();
    }
}
