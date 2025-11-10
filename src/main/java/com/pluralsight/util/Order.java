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
    public void addIceCream(IceCream iceCream) {
        iceCreams.add(iceCream);
    }
    public void addSmoothie(Smoothie smoothie) {
        smoothies.add(smoothie);
    }
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
    public void addIceCreamCake(IceCreamCake iceCreamCake) {
        iceCreamCakes.add(iceCreamCake);
    }
    public List<IceCream> getIceCreams() {
        return iceCreams;
    }
    public List<Smoothie> getSmoothies() {
        return smoothies;
    }
    public List<Topping> getToppings() {
        return toppings;
    }
    public List<IceCreamCake> getIceCreamCakes() {
        return iceCreamCakes;
    }
    boolean has

}
