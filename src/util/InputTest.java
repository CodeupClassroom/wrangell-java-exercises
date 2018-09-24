package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Would you like to input a double?");

        if(input.yesNo()) {
            double someDouble = input.getDouble();
            System.out.println("You entered: " + someDouble);

        } else {
            System.out.println("Ok.");
        }

        System.out.println("Would you like to input an integer?");
        if(input.yesNo()) {
            int userInt = input.getInt();
            System.out.println("You entered: " + userInt);
        } else {
            System.out.println("ok");
        }

    }
}
