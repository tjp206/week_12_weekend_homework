package instruments;

public class Saxophone extends Instrument {

    private int numOfValves;

    public Saxophone(String colour, String type, double costPrice, double salePrice, int numOfValves) {
        super(colour, type, costPrice, salePrice);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public String play() {
        return "Soothing jazz.";
    }

}
