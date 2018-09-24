import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        String myName = "Ryan";

        System.out.println("Please tell me your name: ");
        String yourName = scan.nextLine();

        if(myName == yourName) {
            System.out.println("The two different variables that hold 'Ryan' are == ");
        }

        if(myName.equals(yourName)) {
            System.out.println("My name and your name are strings that are equal in their sequence of letters");
        }

    }
}
