package JavaConceptNo01.While_Loop_Methods_Arrays05;

import java.util.Scanner; // Import Scanner class

public class whileloop {
    public static void main(String[] args) {
        System.out.println("This Is While Loop Section: ");

        // Counting
        int a = 0; // Initialization
        while (a < 10) { // Condition
            a++; // Updation
            System.out.println(a); // Actual work: Print in terminal
        }

        // Reverse Counting
        int b = 10;
        while (b > 0) {
            b--;
            System.out.println(b);
        }

        // User Input with While Loop
        Scanner input = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            System.out.print("Enter a number: ");
            int inp = input.nextInt();
            System.out.println("Your Number Is: " + inp);
            i++;
        }

        input.close(); // Close scanner to prevent resource leak
    }
}
