package com.pluralsight.order;

public abstract class Item {
    private double price;

    public Item(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void calculatePrice(){
        price = 0;
    }
}
