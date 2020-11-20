package acessories;

import behaviours.ISell;

public abstract class Accessories implements ISell {

    private String brand;
    private double costPrice;
    private double salePrice;

    public Accessories(String brand, double costPrice, double salePrice) {
        this.brand = brand;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getBrand() {
        return brand;
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
