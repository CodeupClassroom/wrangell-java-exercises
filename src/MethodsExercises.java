import java.util.Scanner;

/**
 * Basic Arithmetic
 *
 * Create four separate methods. Each will perform an arithmetic operation:
 *
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Each function needs to take two parameters/arguments so that the operation can be performed.
 *
 * Test your functions and verify the output.
 *
 * Add a modulus function that finds the modulus of two numbers.
 *
 * Food for thought: What happens if we try to divide by zero? What should happen?
 *
 * Bonus
 *
 * Create your multiplication method without the * operator (Hint: a loop might be helpful).
 * Do the above with recursion.
 * Create a method that validates that user input is in a certain range
 *
 * The method signature should look like this:
 *
 *
 * public static int getInteger(int min, int max);
 * and is used like this:
 *
 *
 * System.out.print("Enter a number between 1 and 10: ");
 * int userInput = getInteger(1, 10);
 * If the input is invalid, prompt the user again.
 *
 * Hint: recursion might be helpful here!
 *
 * Calculate the factorial of a number.
 *
 * Prompt the user to enter an integer from 1 to 10.
 * Display the factorial of the number entered by the user.
 * Ask if the user wants to continue.
 * Use a for loop to calculate the factorial.
 * Assume that the user will enter an integer, but verify it’s between 1 and 10.
 * Use the long type to store the factorial.
 * Continue only if the user agrees to.
 * A factorial is a number multiplied by each of the numbers before it.
 * Factorials are denoted by the exclamation point (n!). Ex:
 *
 *
 * 1! = 1               = 1
 * 2! = 1 x 2           = 2
 * 3! = 1 x 2 x 3       = 6
 * 4! = 1 x 2 x 3 x 4   = 24
 * Bonus
 *
 * Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
 * Use Recursion to implement the factorial.
 * Create an application that simulates dice rolling.
 *
 * Ask the user to enter the number of sides for a pair of dice.
 * Prompt the user to roll the dice.
 * "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
 * Use static methods to implement the method(s) that generate the random numbers.
 * Use the .random method of the java.lang.Math class to generate random numbers.
 * Game Development 101
 *
 * Welcome to the world of game development!
 *
 * You are going to build a high-low guessing game. Create a class named HighLow inside of src.
 *
 * The specs for the game are:
 *
 * Game picks a random number between 1 and 100.
 * Prompts user to guess the number
 * All user inputs are validated
 * If user's guess is less than the number, it outputs "HIGHER"
 * If user's guess is more than the number, it outputs "LOWER"
 * If a user guesses the number, the game should declare "GOOD GUESS!"
 */


public class MethodsExercises {
    static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int a) {
        long factorial = 1;

        while(a > 1) {
            factorial *= a;
            a--;
        }

        return factorial;

    }

    public static int getInt() {
        int number = scan.nextInt();
        return number;
    }

    public static int getInt(int min, int max) {
        System.out.println("Please input a number between " + min + " and " + max);
        int number = getInt();
        // if the number is in the range of the min and max, then return it.
        if(number >= min && number <= max) {
            return number;
        } else {
            // otherwise, inform the user that their input was outside the range...
            System.out.println(number + " is outside of the range of " + min + " and " + max);
            // and return a call to getInt(min, max)
            // a process defined in terms of itself is "recursive"
            return getInt(min, max);
        }
    }


    /*
     * "Method Overloading" is when we author methods of the same name, but with differing method signatures.
     * Example: If our add method needs to work for int, double, and long data types
     * Then we need to define 3 separate methods that take in those data types and then return the appropriate type.
     * Flexibility in methods for Java is accomplished through "Method Overloading"
     */
    public static int add(int a, int b) {
        return a + b;
    }

    // this add method will run if the arguments sent are long data types
    public static long add(long a, long b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // multiplyWithoutOperator(5, 2)
    // 5 + 5
    // multiplyWithoutOperator(7, 3)
    // 7 + 7 + 7
    // multiplyWithoutOperator(3, 7)
    // 3 + 3 + 3 + 3 + 3+ 3
    public static int multiplyWithoutOperator(int a, int numberOfTimes) {
        if(a == 0 || numberOfTimes == 0) {
            return 0;
        }

        int product = 0;
        // the following runs when both a and numberOfTimes are positive
        // if you ever feel like the code needs to "read your mind"
        // try using a conditional so the code can read the value behind a variable
        // figure out the state under which those lines need to run
        // then, formalize the state into a conditional
        if(a > 0 && numberOfTimes > 0) {
            while(numberOfTimes > 0) {
                product += a;
                numberOfTimes--;
            }
        } else if(a < 0 && numberOfTimes < 0) {
            while(numberOfTimes < 0) {
                product -= a;
                numberOfTimes++;
            }
        } else {
            if(a < numberOfTimes) {
                while(numberOfTimes > 0) {
                    product += a;
                    numberOfTimes--;
                }
            } else {
                while(numberOfTimes < 0) {
                    product -= a;
                    numberOfTimes++;
                }
            }
        }

        return product;
    }

    public static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    // If I could rename modulus, then I'd call it "remainder" since it returns the remainder.
    public static int modulus(int a, int b) {
        return a % b;
    }

    // one method may call another
    public static int remainder(int a, int b) {
        return modulus(a, b);
    }

    public static int quotient(int a, int b) {
        return a / b;
    }


    // recursion from kindergarden songs
    public static void songThatNeverEnds() {
        System.out.println("This is the song that never ends.");
        System.out.println("It goes on and on my friends!");
        System.out.println("Some people started singing it not knowing what it was");
        System.out.println("And now they keep on singing it forever just because...");
        songThatNeverEnds();
    }



}
