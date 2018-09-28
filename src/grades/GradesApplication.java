package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {
    static HashMap<String,Student> records;

    static void init() {
        records = new HashMap<>();
        Student daniel = new Student("Daniel");
        daniel.addGrade(42);
        daniel.addGrade(75);
        daniel.addGrade(80);
        daniel.addGrade(100);
        records.put("danielfryar", daniel);

        Student james = new Student("James");
        james.addGrade(84);
        records.put("james.kevin.a.young", james);

        records.put("githubmonster", new Student("student1"));
        records.get("githubmonster").addGrade(91);

        records.put("MaxPower", new Student("Max"));

    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        init();
        for (String githubhandle: records.keySet())
            System.out.print(" |"+githubhandle+"| ");
        System.out.println();

        Input input = new Input();
        String githubhandle;
        String answer = "yes";

        do {
            System.out.print("What student would you like to see more information on?\n>");
            githubhandle = input.getString();
            if (records.containsKey(githubhandle)) {
                Student student = records.get(githubhandle);
                System.out.println("Name: " + student.getName() + " - Gihub Username: " + githubhandle);
                System.out.println("Current Average: " + student.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the gihub username of \"" + githubhandle + "\".");
            }
            System.out.print("Would you like to see another student?\n>");
            answer = input.getString();
        } while (!answer.toLowerCase().contains("n"));
    }

}
