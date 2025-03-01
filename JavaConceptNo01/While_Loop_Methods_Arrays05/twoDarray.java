package JavaConceptNo01.While_Loop_Methods_Arrays05;

public class twoDarray {
    public static void main(String[] args) {
        
        // First way to initialize a 2D array with predefined values
        int[][] arr = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 2}
        };

        // Print the number of rows in the 2D array
        System.out.println("Number of rows in 'arr': " + arr.length);

        // Second way to define a 2D array (without predefined values)
        int[][] myArr = new int[2][3]; // A 2-row, 3-column array

        // Initializing a value manually in the second array
        myArr[0][0] = 9;

        // Printing all elements of the first 2D array (arr) using a while loop
        System.out.println("\nPrinting elements of 'arr':");
        
        int i = 0; // Row index

        while (i < arr.length) {
            int j = 0; // Column index
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " "); // Print each element
                j++;
            }
            System.out.println(); // Move to the next row
            i++;
        }
    }
}
