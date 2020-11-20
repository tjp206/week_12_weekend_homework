package instruments;

public class Guitar extends Instrument {

    private int numOfStrings;

    public Guitar(String colour, String type, double costPrice, double salePrice, int numOfStrings) {
        super(colour, type, costPrice, salePrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play() {
        return "Rock on dude!";
    }

}
