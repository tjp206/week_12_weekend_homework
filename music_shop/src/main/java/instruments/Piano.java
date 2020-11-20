package instruments;

public class Piano extends Instrument {

    private int numOfKeys;

    public Piano(String colour, String type, double costPrice, double salePrice, int numOfKeys) {
        super(colour, type, costPrice, salePrice);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public String play() {
        return "Heavenly classical.";
    }

}
