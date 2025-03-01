package JavaConceptNo01.While_Loop_Methods_Arrays05;

import java.util.Scanner; // Import Scanner for user input

public class returnStatement {
    public static void main(String[] args) {
        // Display a welcome message
        greet();

        // Read first number from user
        int s1 = readno();

        // Read second number from user
        int second = readno();

        // Calculate the sum
        int sum = s1 + second;
        System.out.println("Solution: " + sum);
    }

    /**
     * This method reads an integer input from the user.
     * It prompts the user to enter a number and returns it.
     *
     * @return The integer value entered by the user
     */
    public static int readno() {
        Scanner input = new Scanner(System.in); // Create Scanner object for input
        System.out.print("Please Enter The Number: ");
        int first = input.nextInt(); // Read user input
        
        return first; // Return the user input
    }

    /**
     * This method prints a greeting message.
     * It does not take any parameters or return a value.
     */
    public static void greet() {
        System.out.println("Welcome To Calculator\n");
    }
}
