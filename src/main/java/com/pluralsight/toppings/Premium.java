package com.pluralsight.toppings;

public abstract class Premium extends Topping{
    private boolean extra;

    public Premium(String name, boolean extra) {
        super(name);
        this.extra = false;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }
}
