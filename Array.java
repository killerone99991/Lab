// Package declaration
package S01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * S01 - Program to insert new element into an existing array
 *
 * @author Tran Hieu Nghia - CE191122
 */
public class Array {

    Scanner scanner = new Scanner(System.in);
    private double[] array; // The integer array
    private String size;    // The size of the array
    private int num1 = 0;
    private String m;

    /**
     * Default constructor to initialize the array with a default size. This
     * size is not properly initialized and may cause issues.
     */
    public Array() {
        // Initialize the array with size (size is uninitialized here)
        array = new double[num1];
    }

    /**
     * Method to get the array.
     *
     * @return the integer array.
     */
    public double[] getArray() {
        return array;
    }

    /**
     * Method to set the array.
     *
     * @param array The integer array to be assigned.
     */
    public void setArray(double[] array) {
        this.array = array;
    }

    /**
     * Method to get the size of the array.
     *
     * @return the size of the array.
     */
    public String getSize() {
        return size;
    }

    /**
     * Method to set the size of the array.
     *
     * @param size The new size of the array.
     */
    public void setSize() {
        this.size = size;
    }

    /**
     * Method to input the array from the user. The size and elements are
     * entered through the console.
     */
    public void inputArray() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        do {
            System.out.print("Please enter size of array: ");
            size = scanner.nextLine();
           if (!size.matches("^\\s*\\d+\\s*$")) {
                System.out.println("Please enter positive integer number");

            }
        } while(!size.matches("^\\s*\\d+\\s*$"));
        String numberOnly1 = size.replaceAll("[^0-9]", "");
        num1 = Integer.parseInt(numberOnly1);
        array = new double[num1];

        // Prompt the user for the array elements
        for (int i = 0; i < num1; i++) {
            do {
                System.out.print("Enter element[" + i + "]: ");
                m = scanner.nextLine();

              if (!size.matches("^\\s*-?\\d+(\\.\\d+)?\\s*$")) {

                    System.out.println("Please enter valid number");
                }

            } while (!size.matches("^\\s*-?\\d+(\\.\\d+)?\\s*$"));
            String numberOnly = m.replaceAll("[^0-9.]", "");
            array[i] = Double.parseDouble(numberOnly);

        }
    }

    /**
     * Method to sort the array in ascending order. Uses the built-in
     * Arrays.sort() method.
     */
    public void sortArray() {
        System.out.println("The array after sorting: ");
        Arrays.sort(array);
    }

    /**
     * Method to display the array elements. Prints each element separated by a
     * space.
     */
    
    public void handleArray(){
       for (double value : array) {
            if (value == (int) value) {
                value = (int) value;      
        }
    }
    }
    
    public void displayArray() {
        for (double value : array) {
            if (value == (int) value) {

                System.out.print((int) value + " ");
            } else {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

    /**
     * Method to insert a new element into the sorted array. The array remains
     * sorted after insertion.
     *
     * @param newElement The element to be inserted.
     */
    public void insertElement() {
        // Prompt the user to enter a new element to insert
        System.out.print("Please enter new value: ");
        String newElement = scanner.nextLine();

        // Create a new array with one additional slot
        double[] newArray = new double[num1 + 1];
         int i = 0, j = 0;
        do{
        if (!newElement.matches("^\\s*-?\\d+(\\.\\d+)?\\s*$")) {

                    System.out.println("Please enter number");
                }
        }while(!newElement.matches("^\\s*-?\\d+(\\.\\d+)?\\s*$"));
         
         double num = Double.parseDouble(newElement);
         if (num == (int) num) {
             num = (int)num;
         }
        // Copy elements while maintaining the sorted order
        while (i < num1 && array[i] < num) {
            newArray[j++] = array[i++];
        }
        // Insert the new element
        newArray[j++] = num;
        // Copy the remaining elements
        while (i < num1) {
            newArray[j++] = array[i++];
        }

        // Update the array and size
        this.array = newArray;
        this.num1++;
    }
}
