import com.codeup.wrangell.daniel.TicTacToe;
import instruments.*;
import shapes.Rectangle;

public class Sandbox {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,6);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Instrument violin = new Violin("Stradivarios");
    }
}


