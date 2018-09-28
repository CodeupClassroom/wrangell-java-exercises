package util;

import java.util.Scanner;
//import org.apache.commons.math3.exception.OutOfRangeException;

class OutOfRangeException extends Exception {}
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
        System.out.println("Please input an integer");
        int input;
        try {
            input = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer");
            input = getInt();
        }
        return input;
    }

    public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        int input;
        try {
            input = Integer.valueOf(getString());
            if (input < min || input > max)
                throw new OutOfRangeException();
//            throw new OutOfRangeException(input, min, max);
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer");
            input = getInt(min,max);
        } catch (OutOfRangeException e) {
            System.out.println("Input is not in range");
            input = getInt(min,max);
        }
        return input;
    }

    public double getDouble() {
        System.out.println("Please input a double precision number");
        double input;
        try {
            input = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("That's not a number");
            input = getDouble();
        }
        return input;
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
