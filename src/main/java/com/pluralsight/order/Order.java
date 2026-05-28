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

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addDrink(Drink drink) {

    }

    public void addBreadSide(BreadSide breadSide) {

    }

    public void calculateTotal() {

    }

    public void printOrder() {

    }
}
