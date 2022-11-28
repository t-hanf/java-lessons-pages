package IntegerToString;

import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an Integer: ");

        // Read n from input
        int n = scanner.nextInt();

        // Create flag to check if n is signed
        boolean signed = n < 0;

        // Create output var and initialize to empty String
        String output = "";

        // If n == 0 we just can print 0
        if (n != 0) {

            // If n is signed
            if (signed) {

                // multiply n by -1 to get positive number
                n *= -1;

            }

            // Run until n is 0 (will happen on division if n < 10 )
            while (n > 0) {

                // Get the Least Significant Digit (the end)
                // 123 % 10 = 3
                int d = n % 10;

                // Use the property of ASCII chars
                // that chars are just numbers
                // and the numbers are in order
                // '0' == 48 -> 48 + 3 == 51 == '3'
                char digit = (char) ((int) '0' + d);

                // Remove Least Significant Digit (the end)
                // 123 / 10 = 12
                n = n / 10;

                // Add the digit character to the front of the String
                output = digit + output;

                // Print each digit
                System.out.println("Current digit: " + digit);
            }

            // If n was signed
            if (signed) {

                // Add a minus sign to the front of the String
                output = '-' + output;
            }

            // If n is 0
        } else {

            // Just set the String to "0"
            output = "0";

        }

        // Print the result
        System.out.println("Converted number: " + output);

    }
}
