package instruments;

public class Violin extends StringInstrument {

    public Violin(String maker) {
        super(maker, 4);
    }

    @Override
    String play() {
        return "lalalala";
    }
}
