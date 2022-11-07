package CelsiusKelvin;

// Import the Scanner
import java.util.Scanner;

public class CelsiusKelvin {
    public static void main(String[] args) {

        // Create String for our units so we don't
        // have to change them everywhere
        String unitFrom = "Celsius";
        String unitTo = "Kelvin";

        System.out.println("Converting from " + unitFrom + " to " + unitTo);

        // Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Input temperature in " + unitFrom + ": ");

        // Read a float from the input and store it into temperature
        float temperature = input.nextFloat();

        /*
         * Convert the input temperature to the wanted unit
         * and print the result to the terminal.
         */

        // Your Code goes here :^)

        // Convert the temperature and store it into a
        // the new variable tempConverted
        float tempConverted = temperature + 273.15f;

        // Print the result
        System.out.println(temperature + " " + unitFrom + " are " + tempConverted + " " + unitTo);

        // Close the input
        input.close();
    }
}
