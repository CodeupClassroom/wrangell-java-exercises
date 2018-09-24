package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // area is pi times the radius^2
    public double getArea() {
        return Math.PI * (radius*radius);
    }

    // circumference is 2 * pi * radius
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
