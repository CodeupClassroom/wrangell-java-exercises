package instruments;

public abstract class Instrument {
    String maker;

    Instrument(String maker) {
        this.maker = maker;
    }

    abstract String play();
}
