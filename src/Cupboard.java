public class Cupboard {

    public static void main(String[] args) {
        // new Cup() instantiates
        Cup cup = new Cup();

        cup.getCoffee();
        System.out.println(cup.describe());

        Cup yourCup = new Cup();
        yourCup.getCoffee();
        yourCup.contents += " with cream and two sugars and a sprinkle of cinnamon";

        System.out.println(yourCup.describe());

    }
}
