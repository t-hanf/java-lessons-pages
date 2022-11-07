package AdvancedMath;

// Import the Scanner
import java.util.Scanner;

public class AdvancedMath {
    public static void main(String[] args) {

        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x: ");

        // Read a double from the input and store it into x
        double x = scanner.nextDouble();

        System.out.print("Input y: ");

        // Read a double from the input and store it into y
        double y = scanner.nextDouble();

        // Calculate z based on the formula from the slides
        double z = ((x * Math.pow(y, 2)) / 107751d * (1682d * Math.pow(y, 2) + 29d))
                + (Math.pow(x, 3) / 107751d * (3d - 2 * Math.pow(x, 2))) + (832d / 107751d);

        // Print the result
        System.out.println("The solution is: " + z);

        // Close the input
        scanner.close();
    }
}
