package com.pluralsight.models;

public class IceCreamCake extends MenuItem {

    public IceCreamCake(String name, double price, String size) {
        super(name, price, size);

    }
    @Override
    public String getDescription() {
        return getName() + " (" + getSize() + ")" +
                (getToppings().isEmpty() ? "" : " - Flavors/Toppings: " + String.join(", ", getToppings()))
                + " - $" + getPrice();
    }
}
