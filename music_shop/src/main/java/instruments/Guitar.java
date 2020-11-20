package instruments;

public class Guitar extends Instrument {     // Instrument parent class reference is used to refer to Guitar child class object.
                                             // As the Guitar object has an "IS-A" relationship with Instrument it is considered polymorphic.

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
