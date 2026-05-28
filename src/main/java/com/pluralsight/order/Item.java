package com.pluralsight.order;

import java.util.List;

public abstract class Item {
    private double price;
    private List<Item> orderItems;

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
