package TemperatureTemplate;

import java.util.Scanner;

public class TemperatureTemplate {
    public static void main(String[] args) {

        String unitFrom = "UnitFrom";
        String unitTo = "UnitTo";

        System.out.println("Converting from " + unitFrom + " to " + unitTo);

        Scanner input = new Scanner(System.in);

        System.out.print("Input temperature in " + unitTo + ": ");
        float temperature = input.nextFloat();

        /*
         * Convert the input temperature to the wanted unit
         * and print the result to the terminal.
         */

        // Your Code goes here :^)

        System.out.println("Your Result goes here :^)");
    }
}
