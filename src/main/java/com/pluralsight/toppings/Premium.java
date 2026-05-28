package com.pluralsight.toppings;

public abstract class Premium extends Topping{
    private boolean extra;

    public Premium(String name, boolean extra) {
        super(name);
        this.extra = extra;
    }
}
