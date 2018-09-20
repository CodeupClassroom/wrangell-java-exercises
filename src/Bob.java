import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bobsEars = new Scanner(System.in);
        String whatYouSay;
        boolean havingANiceConversation = true;
        System.out.println("Bob sits on his iphone...");
        do {
            whatYouSay = bobsEars.nextLine();
//            if (whatYouSay.endsWith("?")) {
//                System.out.println("Sure.");
//            } else if (whatYouSay.endsWith("!")) {
//                System.out.println("Whoa, chill out!!!!");
//            } else if (whatYouSay.isEmpty()) {
//                System.out.println("Fine. Be that way!");
//            } else if (whatYouSay.toLowerCase().contains("bye")){
//                havingANiceConversation = false;
//                System.out.println("Bob walked away");
//            } else {
//                System.out.println("Whatever.");
//            }


        } while (havingANiceConversation);
    }
}
