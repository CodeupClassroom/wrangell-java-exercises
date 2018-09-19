import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean confirm = true;
        while (confirm) {
            System.out.println("Please enter the grade (0-100):");
            int grade = scanner.nextInt();
            String letterGrade = "*";
            if (grade >= 0 && grade <= 100) {
                if (grade >= 98) letterGrade = "A+";
                else if (grade >= 91) letterGrade = "A";
                else if (grade >= 88) letterGrade = "A-";
                else if (grade >= 86) letterGrade = "B+";
                else if (grade >= 83) letterGrade = "B";
                else if (grade >= 80) letterGrade = "B-";
                else if (grade >= 78) letterGrade = "C+";
                else if (grade >= 75) letterGrade = "C";
                else if (grade >= 72) letterGrade = "C-";
                else if (grade >= 67) letterGrade = "D+";
                else if (grade >= 60) letterGrade = "D";
                else letterGrade = "F";
            }
            System.out.println("You got a(n) "+letterGrade);
            System.out.println();
            System.out.println("Do you want to continue?");
            String answer = scanner.next();
            if (!answer.toLowerCase().contains("y"))
                confirm = false;
        }
        System.out.println("Thank you for using our grading system!");

    }
}