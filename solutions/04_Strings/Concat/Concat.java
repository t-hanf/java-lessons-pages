package Concat;

public class Concat {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World!";
        System.out.println(concatenate3(first, second));
        System.out.printf("Int: %04d\n", 23);
    }

    public static String concatenate(String str1, String str2) {
        str1 += ", ";

        for (int i = 0; i < str2.length(); i++) {
            str1 += str2.charAt(i);
        }

        return str1;
    }

    public static String concatenate2(String str1, String str2) {
        return str1.concat(", ".concat(str2));
    }

    public static String concatenate3(String str1, String str2) {
        return str1 + ", " + str2;
    }
}