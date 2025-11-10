package com.pluralsight.util;
import com.pluralsight.models.MenuItem;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> menuItems;

    LocalDateTime orderDate;

    public Order() {
        menuItems = new ArrayList<>();
        orderDate = LocalDateTime.now();
    }
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    public boolean hasMenuItem(MenuItem menuItem) {
        return menuItems.contains(menuItem);
    }
    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    public double CalculatePrice() {
        return menuItems.stream().mapToDouble(MenuItem::getPrice).sum();
    }

}
