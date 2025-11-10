package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuItem {
    private String name;
    private double price;
    private String size;
    private List<String> toppings;

    public MenuItem(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.toppings = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public List<String> getToppings() {
        return toppings;
    }
    public void addTopping(String topping) {
       toppings.add(topping);
    }

    public String getDescription() {
        String toppingStr = toppings.isEmpty() ? "" :
                " - Flavors/Toppings: " + String.join(", ", toppings);
        return name + " (" + size + ")" + toppingStr + " - $" + price;
    }

}

