package JavaConceptNo01.While_Loop_Methods_Arrays05;

public class ArrayExample {
    public static void main(String[] args) {
        // First method: Defining an array with a fixed size and assigning values manually (commented)
        /*
        int[] myArr = new int[5]; // Create an array of size 5
        myArr[0] = 98;
        myArr[1] = 38;
        myArr[2] = 28;
        myArr[3] = 78;
        myArr[4] = 58;
        */

        // Second method: Defining an array with predefined values (preferred method)
        int[] myArr = {2, 55, 44, 88, 96};

        // Printing a specific array element (example)
        // System.out.println(myArr[4]); // Prints the element at index 4 (96)

        // Using a variable for indexing
        // int index = 4;
        // System.out.println(myArr[index]); // Also prints 96

        // Printing all elements using a while loop
        int index = 0; // Start from the first element
        System.out.println("Printing all array elements:");

        while (index < myArr.length) {
            System.out.println("Element at index " + index + ": " + myArr[index]);
            index++; // Move to the next index
        }
    }
}
