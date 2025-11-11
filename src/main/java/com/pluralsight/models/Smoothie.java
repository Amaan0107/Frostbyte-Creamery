package com.pluralsight.models;

public class Smoothie extends MenuItem {
    public Smoothie(String name, double price, String size) {
        super(name, price, size);

    }
    @Override
    public String getDescription() {
        String description = getName() + " (" + getSize() + ")";

        if (!getFlavors().isEmpty()) {
            description += " - Flavors: " + String.join(", ", getFlavors());
        }

        if (!getToppings().isEmpty()) { // optional: smoothies can have toppings
            description += " - Toppings: " + String.join(", ", getToppings());
        }

        return description;
    }
}
