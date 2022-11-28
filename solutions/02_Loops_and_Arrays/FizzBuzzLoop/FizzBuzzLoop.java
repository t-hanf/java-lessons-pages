package FizzBuzzLoop;

import java.util.Scanner;

public class FizzBuzzLoop {
    public static void main(String[] args) {

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");

        // Read n from input
        int n = scanner.nextInt();

        // Run from 1 to n
        for (int i = 1; i <= n; i++) {

            // If i divisible by 3
            if ((i % 3) == 0) {

                // and i divisible by 5
                if ((i % 5) == 0) {
                    System.out.println("fizzbuzz");

                    // Exit the current iteration so we don't print "fizz"
                    continue;
                }

                System.out.println("fizz");
            }

            // If i divisible by 5
            else if ((i % 5) == 0) {
                System.out.println("buzz");
            }

            else {
                System.out.println(i);
            }
        }

    }
}
