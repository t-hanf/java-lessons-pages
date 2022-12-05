package SumMax;

public class SumMax {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("1. The sum is " + sum(new int[] { 1, 2, 3, 4, 5 }));

        // Exercise 2
        int[] numbers = { 11, 3, 4, 8, 11, 2, 9, 5, 7, };
        System.out.println("2. The highest number is " + findMax(numbers));

        // Exercise 3
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] maxValues = new int[3];
        maxValues[0] = findMax(arr1);
        maxValues[1] = findMax(arr2);
        maxValues[2] = findMax(arr3);

        System.out.println("3. The sum of the max numbers of the declared arrays is " + sum(maxValues));
    }

    /**
     * Calculates the sum of the elements in an array
     * 
     * @param arr the array to be summed
     * @return the sum of elements in arr
     */
    public static int sum(int[] arr) {
        int sum = 0;

        // Loop over every element inside arr
        for (int i = 0; i < arr.length; i++) {
            // Calculate the sum iteratively
            sum += arr[i];
        }

        // Return the calculated sum
        return sum;
    }

    /**
     * Finds the maximum value in an array
     * 
     * @param arr
     * @return the maximum of arr
     */
    public static int findMax(int[] arr) {

        // Initialize the max value to the smallest int possible
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // Check if the current value is lager then the current max
            if (arr[i] > max) {

                // Assign the current value as the new max
                max = arr[i];
            }
        }

        // Return the maximum value
        return max;
    }
}
