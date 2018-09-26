package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2*(this.width + this.length);
    }

    public double getArea() {
        return this.length * this.width ;
    }

    // Implementing measurable requires implementing all methods therein,
    // including getPerimeter
}
