package com.pluralsight.order;

public class Drink {
    private String flavor;
    private char size;

    public Drink(String flavor, char size) {
        this.flavor = this.flavor.substring(0, 1).toUpperCase()
                + this.flavor.substring(1).toLowerCase();
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public char getSize() {
        return size;
    }


    public double calculatePrice() {
        double price = 0;
        if (size == 'S') {
            price = 2.00;
        } else if (size == 'M') {
            price = 2.50;
        } else if (size == 'L') {
            price = 3.00;
        }
        return price;
    }

    @Override
    public String toString() {
        return flavor + " drink " + "(" + size + ")\n";
    }
}
