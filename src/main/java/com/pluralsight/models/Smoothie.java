package com.pluralsight.models;

public class Smoothie extends MenuItem {
    public Smoothie(String name, double price, String size) {
        super(name, price, size);

    }
    @Override
    public String getDescription() {
        return getName() + " (" + getSize() + ")" +
                (getToppings().isEmpty() ? "" : " - Flavors/Toppings: " + String.join(", ", getToppings()))
                + " - $" + getPrice();
    }
}
