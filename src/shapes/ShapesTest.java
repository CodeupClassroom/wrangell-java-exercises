package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Quadrilateral box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Quadrilateral box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable myShape = new Rectangle(5, 4.0001);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        ((Rectangle) myShape).setLength(6.2);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        System.out.println();
        myShape = new Square(4.0001);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        ((Square) myShape).setLength(6.2);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(((Square) myShape).getLength());

        // When we call getLength() on myShape, it has to cast it to
        // a type that has that included in it's interface
    }
}
