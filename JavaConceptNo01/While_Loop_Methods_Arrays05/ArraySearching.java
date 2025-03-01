package JavaConceptNo01.While_Loop_Methods_Arrays05;

import java.util.Scanner; // Import Scanner for user input

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining an integer array
        int[] arr = {3, 6, 8, 87, 84, 569, 48, 65, 75, 69, 752, 6, 8, 7};

        // Displaying a welcome message
        System.out.println("Welcome to Array Searching");
        System.out.print("Enter the number to search: ");
        
        // Taking user input for the number to search
        int num = input.nextInt();

        // Checking if the number exists in the array
        boolean isFound = searchNumber(arr, num);

        // Displaying the search result
        if (isFound) {
            System.out.println("Number is found in the array.");
        } else {
            System.out.println("Number is not found in the array.");
        }

        // Defining a string array with a fixed size
        String[] strArr = new String[4];
        strArr[0] = "My String";

        // Defining and initializing another string array
        String[] newStrArr = {"First", "Second", "Third", "Fourth"};

        // Printing the length of the second string array
        System.out.println("Length of newStrArr: " + newStrArr.length);

        // Closing the scanner to prevent resource leaks
        input.close();
    }

    /**
     * Searches for a given number in the provided array.
     *
     * @param arr The array to search in
     * @param num The number to find
     * @return true if the number is found, otherwise false
     */
    public static boolean searchNumber(int[] arr, int num) {
        int index = 0;

        // Using a while loop to search through the array
        while (index < arr.length) {
            if (arr[index] == num) {
                return true; // Number found, return true
            }
            index++; // Move to the next index
        }
        
        return false; // Number not found
    }
}
