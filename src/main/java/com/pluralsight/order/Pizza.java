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

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void calculatePrice() {

    } // use for loop through toppings

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
