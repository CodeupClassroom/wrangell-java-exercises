package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the records grades
    @Deprecated
    public double getGradeAverage(){
        double gradesTotal = 0;
        for (int grade:this.grades) gradesTotal+= grade;
        return gradesTotal / this.grades.size();
    }

    @Override
    public String toString() {
        return "Name: " + this.name +"\n" +
                "Grades Average: " + this.getGradeAverage() + "\n";
    }

    public static void main(String[] args) {
        Student jeff = new Student("Jeff");
        jeff.addGrade(43);
        jeff.addGrade(86);
        jeff.addGrade(100000);
        System.out.println(jeff.getName());
        System.out.println(jeff.getGradeAverage());

        Student romulus = new Student("romulus");
        romulus.addGrade(55);
        romulus.addGrade(65);
        romulus.addGrade(75 );
        System.out.println(romulus.getName());
        System.out.println(romulus.getGradeAverage());
    }
}
