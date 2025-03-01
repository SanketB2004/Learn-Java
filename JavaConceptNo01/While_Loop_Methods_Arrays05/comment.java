package JavaConceptNo01.While_Loop_Methods_Arrays05;

public class comment {
    public static void main(String[] args) {
        // This is a single-line comment
        System.out.println("Hello, World!"); // This is another single-line comment
        
        /*
         * This is a multi-line comment.
         * It can span multiple lines.
         * Useful for block comments.
         */
        int number = 10; // Variable declaration
        System.out.println("Number: " + number);
    }
    
    /**
     * This is a Javadoc comment.
     * It is used to generate documentation for methods and classes.
     * 
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        return a + b; // Returning sum
    }
}
