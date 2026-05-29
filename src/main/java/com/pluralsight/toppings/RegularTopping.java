package com.pluralsight.toppings;

public class RegularTopping extends Topping{
    public RegularTopping(String name) {
        super(name);
    }

    @Override
    public double calculatePrice(int size) {
        double price = 0.0;
        return price;
    }
}
