package com.pluralsight.order;

public class BreadSide extends Item{
    private String sideType;

    public BreadSide(double price, String sideType) {
        super(price);
        this.sideType = sideType;
    }

    @Override
    public void calculatePrice() {
        double price = 1.50;
    }

    @Override
    public String toString() {
        return "BreadSide{" +
                "sideType='" + sideType + '\'' +
                '}';
    }
}
