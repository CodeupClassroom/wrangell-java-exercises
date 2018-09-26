package instruments;

public class StringInstrument extends Instrument implements MuseumArticle {
    int numberOfStrings;

    public StringInstrument(String maker, int numberOfStrings) {
        super(maker);
        this.numberOfStrings = numberOfStrings;
    }

    String play() {
        return "tluck tluck";
    }

}
