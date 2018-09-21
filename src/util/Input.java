package util;

import java.util.Scanner;

/**
 * String getString()
 * boolean yesNo()
 * int getInt(int min, int max)
 * int getInt()
 * double getDouble(double min, double max)
 * double getDouble()
 * The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
 *
 */
public class Input {
    private Scanner scan;

    // constructor runs whenever we see "new Input()"
    public Input() {
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return scan.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public int getInt() {
        return scan.nextInt();
    }

    public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        return getInt();
    }

    public double getDouble() {
        return scan.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        return getDouble();
    }

    public boolean yesNo() {
        System.out.println("Please input yes or y to continue");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
}
