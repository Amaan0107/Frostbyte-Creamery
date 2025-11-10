package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class IceCream extends MenuItem {
    private String container;
    private int scoops;
    private List<Topping> toppings;

    public IceCream(String name, double price, String size, String container) {
        super(name, price, size);
        this.container = container;
        this.scoops = scoops;
        this.toppings = new ArrayList<>();
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    @Override
    public String getDescription() {
        return getName() + " (" + getSize() + ", " + getContainer() + ") - $" + getPrice();
    }
}
