package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {

        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public int getArea() {
        return this.width * this.length;
    }
}
