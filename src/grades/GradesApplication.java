package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String,Student> students = new HashMap<>();

        Student daniel = new Student("Daniel");
        daniel.addGrade(42);
        students.put("danielfryar", daniel);

        Student james = new Student("James");
        james.addGrade(84);
        students.put("james.kevin.a.young", james);

        students.put("githubmonster", new Student("student1"));
        students.get("githubmonster").addGrade(91);

        students.put("MaxPower", new Student("Max"));
    }

}
