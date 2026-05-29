package com.pluralsight.order;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private LocalDateTime orderDateTime;
    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private List<BreadSide> breadSides;

    public Order(LocalDateTime orderDateTime, List<Pizza> pizzas, List<Drink> drinks, List<BreadSide> breadSides) {
        this.orderDateTime = orderDateTime;
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.breadSides = breadSides;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
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
            System.out.println(pizza);
        }

        for (Drink drink : drinks) {
            System.out.println(drink);
        }

        for (BreadSide breadSide : breadSides) {
            System.out.println(breadSide);
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
