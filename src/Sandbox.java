import com.codeup.wrangell.daniel.TicTacToe;
import java.util.Scanner;


public class Sandbox {

    public static void main(String[] args) {

//        String[] words = new String[7];
//        words[0] = "Hello";
//        words[1] = "Bonjour";
//        words[2] = "Hola";
//        words[3] = "Aloha";
//        for (String word:words) {
//            System.out.println(word);
//        }
//

        TicTacToe game = new TicTacToe();
//        game.takeTurn(1,1);
//        game.takeTurn(2,2);
//        game.takeTurn(1,2);
//        game.takeTurn(1,0);
//        game.takeTurn(2,0);
//        game.takeTurn(0,2);
//        game.takeTurn(0,1);
//        game.takeTurn(2,1);
//        game.takeTurn(0,0);

        while (true) {
            game.takeTurn();
        }
    }
}


