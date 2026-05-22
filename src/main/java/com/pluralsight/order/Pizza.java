package com.pluralsight.order;

public class Pizza {
    public int size;
    public String crustSize;
    public boolean stuffedCrust;
    public String toppings;

    public void addTopping() {

    }

    public void calculatePrice() {

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", crustSize='" + crustSize + '\'' +
                ", stuffedCrust=" + stuffedCrust +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
