package com.pluralsight.util;
import com.pluralsight.models.IceCream;
import com.pluralsight.models.IceCreamCake;
import com.pluralsight.models.Topping;
import com.pluralsight.models.Smoothie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<IceCream> iceCreams;
    private List<Smoothie> smoothies;
    private List<Topping> toppings;
    private List<IceCreamCake> iceCreamCakes;

    LocalDateTime orderDate;

}
