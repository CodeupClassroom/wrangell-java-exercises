package instruments;

public class StringInstrument extends Instrument {
    int numberOfStrings;

    public StringInstrument(String maker, int numberOfStrings) {
        super(maker);
        this.numberOfStrings = numberOfStrings;
    }

    String play() {
        return "tluck tluck";
    }

}
