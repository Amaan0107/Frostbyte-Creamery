package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private String name;
    private double price;
    private String size;
    private List<String> toppings;
    private List<String> flavors;

    public MenuItem(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.toppings = new ArrayList<String>();
        this.flavors = new ArrayList<String>();
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
    public List<String> getFlavors() {
        return flavors;
    }
    public void addFlavor(String flavor) {
        flavors.add(flavor);
    }

    public String getDescription() {
        String flavorStr = flavors.isEmpty() ? "" :
                " - Flavors: " + String.join(", ", flavors);
        String toppingStr = toppings.isEmpty() ? "" :
                " - Toppings: " + String.join(", ", toppings);
        return name + " (" + size + ")" + toppingStr;
    }

}

