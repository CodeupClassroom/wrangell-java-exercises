package shapes;

import util.Input;

/**
 * 1. Prompt the user for a radius of a circle
 * 2. Create a circle of that radius.
 * 3. Output the circumference and the area
 *
 */
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Welcome to the circle creation application");
        System.out.println("Please input the radius of a new circle");

        double radius = input.getDouble();
        Circle circle = new Circle(radius);

        System.out.print("The area of a circle with radius " + circle.getRadius() + " is: ");
        System.out.println(circle.getArea());
        System.out.print("And the circumference is: ");
        System.out.print(circle.getCircumference());



    }



}
