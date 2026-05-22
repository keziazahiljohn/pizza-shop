package com.pluralsight.order;

public class Drinks {
    private String flavor;
    private char size;

    public void calculatePrice() {}

    @Override
    public String toString() {
        return "Drinks{" +
                "flavor='" + flavor + '\'' +
                ", size=" + size +
                '}';
    }
}
