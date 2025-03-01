package JavaConceptNo01.While_Loop_Methods_Arrays05;

public class FunctionExample {
    
    // A function that prints a message (void method)
    public static void greet() {
        System.out.println("Hello! Welcome to Java functions.");
    }

    // A function that adds two numbers and returns the result
    public static int add(int a, int b) {
        return a + b;
    }

    // A function that checks if a number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        // Calling the greet function
        greet();
        
        // Calling the add function
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);

        // Calling the isEven function
        int number = 7;
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");

           starpattern();
        }
    }
    

        /**
         * This method prints a left-aligned triangular star pattern.
         * The number of rows is fixed at 30, but this can be modified.
         * Uses a while loop for both rows and columns.
         */
        public static void starpattern() {
            int row = 0; // Counter for the number of rows
    
            // Outer loop: Controls the number of rows in the pattern
            while (row < 30) {
                System.out.print("*"); // Print the first star in the row
    
                int second = 0; // Counter for additional stars in each row
                // Inner loop: Prints additional stars after the first one
                while (second < row) {
                    System.out.print(" *"); // Print star with space for alignment
                    second++; // Increment the counter
                }
    
                System.out.println(); // Move to the next line after completing a row
                row++; // Increment the row counter to proceed to the next row
            }
        }
    
        
    }
    

