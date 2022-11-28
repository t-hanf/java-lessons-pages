import java.util.Scanner;

public class EvenNumbers2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");

        // Read n from input
        int n = scanner.nextInt();

        // Create counter variable an set it to 0
        int i = 0;

        // While i less then or equal to n
        while (i <= n) {
            // Print i
            System.out.println(i);

            // Add 2 to i (next even number)
            i += 2;
        }
    }
}
