package com.pluralsight.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MenuItemTest {
    @Test
    public void testConstructorAndGetters() {
        MenuItem item = new MenuItem("Ice Cream", 3.50, "Small");
        assertEquals("Ice Cream", item.getName());
        assertEquals(3.50, item.getPrice());
        assertEquals("Small", item.getSize());
    }

}