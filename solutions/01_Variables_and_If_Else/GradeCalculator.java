package GradeCalculator;

// Import the scanner
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        /*
         * Read in the total number of points
         * and the achieved points.
         * 
         * | Percentage | Grade |
         * |------------+-------|
         * | >= 93 | 1.0 |
         * | 88 | 1.3 |
         * | 81 | 1.7 |
         * | 76 | 2.0 |
         * | 71 | 2.3 |
         * | 64 | 2.7 |
         * | 59 | 3.0 |
         * | 54 | 3.3 |
         * | 47 | 3.7 |
         * | 42 | 4.0 |
         * | < 42 | 5.0 |
         * 
         * Calculate the grade based on the given table
         * and print the result to the terminal.
         */
        System.out.println("Please enter a number: ");

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input total number of points: ");

        // Read the total number of points from input
        int total = scanner.nextInt();

        System.out.print("Input achieved number of points: ");

        // Read the achieved number of points from input
        float achieved = scanner.nextFloat();

        // Calculate the percentage that was achieved
        float percentage = achieved / total;

        // Create a variable for storing the grade
        float grade;

        // Decide the grade based on the table
        if (percentage >= .93f) {
            grade = 1.0f;
        } else if (percentage >= .88f) {
            grade = 1.3f;
        } else if (percentage >= .81f) {
            grade = 1.7f;
        } else if (percentage >= .76f) {
            grade = 2.0f;
        } else if (percentage >= .71f) {
            grade = 2.3f;
        } else if (percentage >= .64f) {
            grade = 2.7f;
        } else if (percentage >= .59f) {
            grade = 3.0f;
        } else if (percentage >= .54f) {
            grade = 3.3f;
        } else if (percentage >= .47f) {
            grade = 3.7f;
        } else if (percentage >= .42f) {
            grade = 4.0f;
        } else {
            grade = 5.0f;
        }

        // Print the grade
        System.out.println("Your grade is: " + grade);

    }
}
