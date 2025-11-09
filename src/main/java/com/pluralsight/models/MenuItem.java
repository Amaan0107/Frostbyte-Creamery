package com.pluralsight.models;

public abstract class MenuItem {
    private String name;
    private double price;
    private String size;

    public MenuItem(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
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

    public String getDescription() {
        return name + " (" + size + ") - $" + price;
    }
}
