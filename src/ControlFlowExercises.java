import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        int userInt = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("  number  |  squared  |  cubed  ");
        System.out.println(" -------- | --------- | -------- ");
        for (long i = 1; i <= userInt; i++) {
            System.out.format(" %-9s| %-9s | %-9s%n",
                    i,
                    i * i,
                    i * i * i);
        }
    }
}