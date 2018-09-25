package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }


    public int getPerimeter() {
        return 4 * length;
    }


    public int getArea() {
        return length * length;
    }
}
