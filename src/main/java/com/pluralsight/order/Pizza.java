package com.pluralsight.order;

import com.pluralsight.toppings.Topping;

import java.util.List;

public class Pizza {
    public int size;
    public String crustType;
    public boolean stuffedCrust;
    public List<Topping> toppings;

    public Pizza(int size, String crustType, boolean stuffedCrust, List<Topping> toppings) {
        this.size = size;
        this.crustType = crustType;
        this.stuffedCrust = stuffedCrust;
        this.toppings = toppings;
    }

    public String getCrustType(){
        return crustType;
    }

    public List<Topping> getToppings(){
        return toppings;
    }

    public boolean isStuffedCrust() {
        return stuffedCrust;
    }

    // helpers
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculatePrice() {
        double totalPizzaPrice = 0;
        switch (size) {
            case 8 -> {
                totalPizzaPrice = 8.50;
            }

            case 12 -> {
                totalPizzaPrice = 12.00;
            }

            case 16 -> {
                totalPizzaPrice = 16.50;
            }
        }
        for (Topping topping : toppings) {
            double price = topping.calculatePrice(size);
            totalPizzaPrice += price;
        }
        return totalPizzaPrice;
    } // use for loop through toppings

    @Override
    public String toString() {
        String output = "1" + size + "\" Pizza \n"
                + "Crust Type: " + crustType + "\n";

        if (isStuffedCrust()) {
            output += "With Stuffed Crust";
        }

        output += "Toppings:\n";
        for (Topping topping : toppings) {
            output += " - " + topping;
        }

        return output;
    }
}
