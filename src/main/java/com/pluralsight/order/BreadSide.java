package com.pluralsight.order;

public class BreadSide {
    private String sideType;

    public BreadSide(double price, String sideType) {
        this.sideType = sideType.substring(0, 1).toUpperCase()
                        + sideType.substring(1).toLowerCase();

    }

    public double calculatePrice() {
        double price = 1.50;
        return price;
    }

    @Override
    public String toString() {
        sideType
        return sideType;
    }
}
