package com.pluralsight.models;

public class IceCream extends MenuItem {
    private String container;

    public IceCream(String name, double price, String size, String container) {
        super(name, price, size);
        this.container = container;
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
