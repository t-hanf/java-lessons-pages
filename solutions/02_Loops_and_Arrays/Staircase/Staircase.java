package Staircase;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");

        // Read n from input
        int n = scanner.nextInt();

        // iterating from 1 to n
        for (int i = 0; i < n; i++) {
            // Print * i number of times (i -> current step)
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }

            // Print a newline (Zeilenumbruch)
            System.out.print('\n');
        }
    }

}
