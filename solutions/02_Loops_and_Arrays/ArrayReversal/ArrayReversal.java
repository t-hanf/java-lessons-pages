package ArrayReversal;

public class ArrayReversal {
    public static void main(String[] args) {

        // create array of size 10
        int[] a = new int[10];

        // Filling the array with data
        a[0] = 5;
        a[1] = 23;
        a[2] = 87;
        a[3] = 1;
        a[4] = 35;
        a[5] = 72;
        a[6] = 19;
        a[7] = 7;
        a[8] = 89;
        a[9] = 10;

        System.out.print("Normal order: \t");

        // Starting from 0; running until i >= length of a; increment i by 1
        for (int i = 0; i < a.length; i++) {

            // Print the ith element if a
            System.out.print(a[i]);

            // If we are *not* at the last element
            if (i != a.length - 1) {

                // To make it more readable
                System.out.print(", ");
            }
        }

        System.out.print("\n");

        System.out.print("Reverse order: \t");

        // Starting from the length of a - 1; run until i < 0; decrement i by 1
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);

            // If we are *not* at the last element
            if (i != 0) {

                // To make it more readable
                System.out.print(", ");
            }
        }

        System.out.print('\n');

    }
}
