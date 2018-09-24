import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = {
            "fast",
            "tiny",
            "ambitious",
            "funky",
            "cool",
            "blue",
            "bald",
            "untoward",
            "bewildered",
            "sleepy",
            "awake"};
    private static String[] nouns = {
            "rodeo",
            "aardvark",
            "koala",
            "city",
            "dog",
            "panda",
            "shoes",
            "macbook",
            "sea-otter",
            "cat",
            "rat"
    };


    public static String pickRandomWord(String[] words) {
        Random rand = new Random();
        int i = rand.nextInt(words.length);
        return words[i];
    }

    public static void main(String[] args) {
//        ServerNameGenerator sng = new ServerNameGenerator();
        String word1 = pickRandomWord(adjectives);
        String word2 = pickRandomWord(nouns);
        System.out.println("Here is your server name:");
        System.out.println(word1 + "-" + word2);
    }
}
