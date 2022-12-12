
public class Find {
    public static void main(String[] args) {
        String first = "concatenate";
        String second = "cat";

        int index = find(first, second);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Second string at index " + index);
        }

    }

    public static int find(String str1, String str2) {
        // Loop over every character in str1
        for (int i = 0; i < str1.length(); i++) {

            // Loop over every character of str2 or until the end of str1
            for (int j = 0; j < Math.min(str2.length(), str1.length() - i); j++) {

                // If the characters don't match
                if (str1.charAt(i + j) != str2.charAt(j)) {

                    // Exit the inner loop (We don't need the check the rest of the characters)
                    break;
                }

                // If we are at the end of the string
                // And every characters matched
                if (j == str2.length() - 1) {

                    // Return the starting position in str1 (and exit the function)
                    return i;
                }
            }
        }

        // Return -1 to indicate that no match was found
        return -1;
    }
}