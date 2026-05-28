package com.pluralsight.order;

import com.pluralsight.toppings.Toppings;

import java.util.List;

public class Pizza extends Item {
    public int size;
    public String crustSize;
    public boolean stuffedCrust;
    public List<Toppings> toppings;

    public Pizza(double price, int size, String crustSize, boolean stuffedCrust, List<Toppings> toppings) {
        super(price);
        this.size = size;
        this.crustSize = crustSize;
        this.stuffedCrust = stuffedCrust;
        this.toppings = toppings;
    }

    public int getSize(){
        return size;
    }

    public String getCrustType(){
        return crustSize;
    }

    public List<Toppings> getToppings(){
        return toppings;
    }

    public void addTopping() {

    }

    @Override
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
