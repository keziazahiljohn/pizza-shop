package com.pluralsight.order;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private LocalDateTime orderDateTime;
    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private List<BreadSide> breadSides;

    public LocalDateTime getOrderDateTime() {
        return LocalDateTime.now();
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<BreadSide> getBreadSides() {
        return breadSides;
    }

    // helpers
    public void addPizzaToOrder(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addDrinkToOrder(Drink drink) {
        drinks.add(drink);
    }

    public void addBreadSideToOrder(BreadSide breadSide) {
        breadSides.add(breadSide);
    }

    public double calculateTotal() {
        // Pizza
        double orderTotalCost = 0;
        for (Pizza pizza : pizzas) {
            orderTotalCost += pizza.calculatePrice();
        }

        // Drink
        for (Drink drink : drinks) {
            orderTotalCost += drink.calculatePrice();
        }

        for (BreadSide breadSide : breadSides) {
            orderTotalCost += breadSide.calculatePrice();
        }
        return orderTotalCost;
    }

    public void printOrder() {
        System.out.println("Complete Order:");
        for (Pizza pizza : pizzas) {
            pizza.toString();
        }

        for (Drink drink : drinks) {
            drink.toString();
        }

        for (BreadSide breadSide : breadSides) {
            breadSide.toString();
        }
        System.out.println("Total: $%.2f%n" + calculateTotal());
    }
}
