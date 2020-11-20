package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String colour;
    private String type;
    private double costPrice;
    private double salePrice;

    public Instrument(String colour, String type, double costPrice, double salePrice) {
        this.colour = colour;
        this.type = type;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double calculateMarkup() {
        double markup = getSalePrice() - getCostPrice();
        return markup;
    }
}
