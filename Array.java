// Package declaration
package S01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * S01 - Program to insert new element into an existing array
 *
 * @author Tran Hieu Nghia - CE191122
 */
public class Array {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> array;
    private String size;    // The size of the array
    private int num1 = 0;
    private String m;

    /**
     * Default constructor to initialize the array with a default size. This
     * size is not properly initialized and may cause issues.
     */
    public Array() {

    }

    /**
     * Method to get the array.
     *
     * @return the integer array.
     */
    /**
     * Method to input the array from the user. The size and elements are
     * entered through the console.
     */
    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        array = new ArrayList<Integer>();

        // Prompt the user for the size of the array
        num1 = Integer.parseInt(Handle.validSize(size));

        // Prompt the user for the array elements
        for (int i = 0; i < num1; i++) {
            System.out.print("Enter element[" + i + "]: ");

            array.add(Integer.parseInt(Handle.validElement(m, size)));

        }

    }

    /**
     * Method to sort the array in ascending order. Uses the built-in
     * Arrays.sort() method.
     */
    public void sortArray() {
        array.sort((o1, o2) -> {
            return o1.compareTo(o2);
        });
    }

    /**
     * Method to display the array elements. Prints each element separated by a
     * space.
     */
    @Override
    public String toString() {
        String stringArray = "";
        for (int value : array) {
            stringArray += value + " ";
        }
        return stringArray;
    }

    /**
     * Method to insert a new element into the sorted array. The array remains
     * sorted after insertion.
     *
     * @param newElement The element to be inserted.
     */
    public void insertElement() {
        // Prompt the user to enter a new element to insert

        int num2 = num1 + 1;
        int newElement = Integer.parseInt(Handle.validElement(m, size));
        // Create a new array with one additional slot
        int index = -1;

        int size = array.size();
        for (int i = 0; i < size; i++) {
            if (newElement < array.get(i)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            array.add(index, newElement);
        } else {
            array.add(newElement);
        }
    }
}
