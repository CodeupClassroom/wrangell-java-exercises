package instruments;


public class Instrument {
    String maker;

    Instrument(String maker) {
        this.maker = maker;
    }

    String play() {
        return "...";
    }
}

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


public class Violin extends StringInstrument {

    public Violin(String maker) {
        super(maker, 4);
    }

    @Override
    String play() {
        return "lalalala";
    }
}

public class Orchestra {


    public static void main(String[] args) {
        Instrument violin = new Violin("Antonio Strad");

        System.out.println(violin.play());
    }
}
