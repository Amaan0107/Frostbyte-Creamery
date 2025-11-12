package com.pluralsight.util;

import com.pluralsight.models.MenuItem;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class OrderTest {
    @Test
    void testAddMenuItemAndCalculatePrice() {
        Order order = new Order();
        MenuItem item1 = new MenuItem("Ice Cream", 3.50, "Small");
        MenuItem item2 = new MenuItem("Smoothie", 5.55, "Small");

        order.addMenuItem(item1);
        order.addMenuItem(item2);

        assertEquals(2, order.getMenuItems().size());
        assertTrue(order.hasMenuItem(item1));
        assertEquals(9.05, order.CalculatePrice(), 0.001);
    }

}