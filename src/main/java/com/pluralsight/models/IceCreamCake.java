package com.pluralsight.models;

public class IceCreamCake extends MenuItem {

    public IceCreamCake(String name, double price, String size) {
        super(name, price, size);

    }
    @Override
    public String getDescription() {
        String description = getName() + " (" + getSize() + ")";

        if (!getFlavors().isEmpty()) {
            description += " - Flavors: " + String.join(", ", getFlavors());
        }

        if (!getToppings().isEmpty()) { // cake can also have toppings
            description += " - Toppings: " + String.join(", ", getToppings());
        }

        return description;
    }
}
