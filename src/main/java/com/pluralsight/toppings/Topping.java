package com.pluralsight.toppings;

public abstract class Topping {
    private String name;

    public Topping(String name) {
        this.name = name;
    }

    public void calculatePrice() {
        double price = 0.0;
    }

}
