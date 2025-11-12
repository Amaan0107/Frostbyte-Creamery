package com.pluralsight.models;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MenuItemTest {
    @Test
    public void testConstructorAndGetters() {
        MenuItem item = new MenuItem("Ice Cream", 3.50, "Small");
        assertEquals("Ice Cream", item.getName());
        assertEquals(3.50, item.getPrice());
        assertEquals("Small", item.getSize());
    }
    @Test
    public void testAddToppingsAndFlavors() {
        MenuItem item = new MenuItem("Smoothie", 6.00, "Medium");
        item.addTopping("Whipped Cream");
        item.addFlavor("Mango");

        assertEquals(List.of("Whipped Cream"), item.getToppings());
        assertEquals(List.of("Mango"), item.getFlavors());
    }
    @Test
    public void testGetDescriptionWithToppingsAndFlavors() {
        MenuItem item = new MenuItem("Ice Cream", 3.50, "Medium");
        item.addTopping("Sprinkles");
        item.addFlavor("Chocolate");

        String desc = item.getDescription();
        assertTrue(desc.contains("Sprinkles"));
        assertTrue(desc.contains("Chocolate"));
        assertTrue(desc.contains("Medium"));
    }

}