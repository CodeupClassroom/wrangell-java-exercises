// Classes are blueprints for creating objects
public class Cup {

    public final String manufacturer = "CodeupCup, Inc.";

    boolean isEmpty;
    boolean isInsulated;
    boolean isClean;
    boolean hasLid;

    int currentTemperature;
    double volume;

    String color;
    String material;
    String contents;

    public void getCoffee() {
        isEmpty = false;
        currentTemperature = 110;
        contents = "Coffee";
        isClean = false;
    }

    public void washCup() {
        isClean = true;
        isEmpty = true;
        contents = "";
        currentTemperature = 70;
    }

    public void drinkContents() {
        contents = "";
        isEmpty = true;
        isClean = false;
    }

    public String describe() {
        if(isEmpty && isClean) {
            return "this cup is empty and clean";
        } else if(!isEmpty) {
            return "this cup contains " + contents + " and is " + currentTemperature + " degrees.";
        } else {
            return "Dirty dishes don't go in the sink. You wash them right now and put them up!";
        }
    }



}
