package com.pluralsight.toppings;

public class Cheese extends Premium {
    public Cheese(String name, boolean extra) {
        super(name, extra);
    }

    @Override
    public double calculatePrice(int size) {
        double price = 0.0;
        switch (size) {
            case 8 -> {
                if (isExtra()) {
                    price = 1.05;
                } else {
                    price = 0.75;
                }
            }

            case 12 -> {
                if (isExtra()) {
                    price = 2.10;
                } else {
                    price = 1.50;
                }
            }

            case 16 -> {
                if (isExtra()) {
                    price = 3.15;
                } else {
                    price = 2.25;
                }
            }
        }
        return price;
    }
}