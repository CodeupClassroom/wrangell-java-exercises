import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/** You are going to build a high-low guessing game. Create a class named HighLow inside of src.
 *
 * The specs for the game are:
 *
 * Game picks a random number between 1 and 100.
 * Prompts user to guess the number
 * All user inputs are validated
 * If user's guess is less than the number, it outputs "HIGHER"
 * If user's guess is more than the number, it outputs "LOWER"
 * If a user guesses the number, the game should declare "GOOD GUESS!"
 * Keep going until the user guesses the number.
 */

public class HighLowGame {
    static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        int randomNumber = (int) (Math.ceil(Math.random() * 100));

        int userGuess;

        do {

            System.out.println("Please guess a number between 1 and 100");

            userGuess = getInt(1, 100);

            if(userGuess < randomNumber) {
                System.out.println("HIGHER!");
            } else if(userGuess > randomNumber) {
                System.out.println("LOWER!!");
            }

        } while(userGuess != randomNumber);

        System.out.println("YOU GUESSED IT, YAY!");
        System.out.println("🎈🎈");

        System.out.println("Do you want to play another game? Press y for yes!");
        String userAnswer = scan.next();
        if(userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
            playGame();
        } else {

            System.out.println("Good Bye.");
        }


    }

    public static int getInt(int min, int max) {

        int userInt = scan.nextInt();
        if(userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Make sure that your number is between " + min + " and " + max);
            return getInt(min, max);
        }
    }
}
