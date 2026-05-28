package com.pluralsight.toppings;

public class Meat extends Premium{
    public Meat(String name, boolean extra) {
        super(name, extra);
    }

    @Override
    public void calculatePrice(String size) {
        double price = 0.0;
    }
}
