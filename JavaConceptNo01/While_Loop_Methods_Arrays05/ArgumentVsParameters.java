package JavaConceptNo01.While_Loop_Methods_Arrays05;

public class ArgumentVsParameters {

    public static void main(String[] args) {
        // Calling sumTwoNo() with arguments 4 and 7
        int num = sumTwoNo(4, 7);
        
        // Printing the result
        System.out.println("Sum: " + num);
    }

    /**
     * This method takes two integer parameters, adds them, and returns the sum.
     *
     * @param first  The first number (parameter)
     * @param second The second number (parameter)
     * @return The sum of the two numbers
     */
    public static int sumTwoNo(int first, int second) {
        // Display received parameters
        System.out.println("First Number Received: " + first);
        System.out.println("Second Number Received: " + second);

        // Calculate sum
        int sum = first + second;

        // Return the sum to the caller
        return sum;
    }
}
