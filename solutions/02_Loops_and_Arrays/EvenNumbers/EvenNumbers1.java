import java.util.Scanner;

public class EvenNumbers1 {
    public static void main(String[] args) {

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");

        // Read n from input
        int n = scanner.nextInt();

        // Create counter i; run until i > n; add 1 to i after every run
        for (int i = 0; i <= n; i++) {

            // If i is evenly divisible by 2 (even)
            if (i % 2 == 0) {
                // Print i
                System.out.println(i);
            }
        }

    }
}
