package com.pluralsight.order;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private LocalDateTime orderDateTime;
    private List<Pizza> pizzaAmount;
    private List<Drinks> drinkAmount;
    private List<BreadSide> breadAmount;

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public List<Pizza> getPizzaAmount() {
        return pizzaAmount;
    }

    public List<Drinks> getDrinkAmount() {
        return drinkAmount;
    }

    public List<BreadSide> getBreadAmount() {
        return breadAmount;
    }

    public void addPizza() {

    }

    public void addDrink() {

    }

    public void addBreadSide() {

    }

    public void calculateTotal() {

    }

    public void printOrder() {

    }
}
