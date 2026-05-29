package com.pluralsight.order;

import com.pluralsight.toppings.Topping;

import java.util.List;

public class Pizza {
    public int size;
    public String crustSize;
    public String crustType;
    public boolean stuffedCrust;
    public List<Topping> toppings;

    public Pizza(double price, int size, String crustSize, String crustType, boolean stuffedCrust, List<Topping> toppings) {
        this.size = size;
        this.crustSize = crustSize;
        this.crustType = crustType;
        this.stuffedCrust = stuffedCrust;
        this.toppings = toppings;
    }

    public int getSize(){
        return size;
    }

    public String getCrustType(){
        return crustSize;
    }

    public List<Topping> getToppings(){
        return toppings;
    }

    public String getCrustSize() {
        return crustSize;
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
        String output = "1" + crustSize + "\" Pizza \n"
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
