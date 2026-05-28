package com.pluralsight.order;

public class Drink {
    private String flavor;
    private char size;

    public Drink(String flavor, char size) {
        this.flavor = flavor;
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public char getSize() {
        return size;
    }


    public void calculatePrice() {
        double price;
        if (size == 'S') {
            price = 2.00;
        } else if (size == 'M') {
            price = 2.50;
        } else if (size == 'L') {
            price = 3.00;
        }
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "flavor='" + flavor + '\'' +
                ", size=" + size +
                '}';
    }
}
