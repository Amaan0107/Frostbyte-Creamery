package com.pluralsight.models;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class IceCreamTest {
    @Test
    void testGetDescriptionWithAllDetails() {
        IceCream iceCream = new IceCream("Chocolate Delight", 4.5, "Large", "Cone");
        iceCream.addFlavor("Chocolate");
        iceCream.addTopping("Sprinkles");

        String desc = iceCream.getDescription();
        assertTrue(desc.contains("Chocolate Delight"));
        assertTrue(desc.contains("Cone"));
        assertTrue(desc.contains("Chocolate"));
        assertTrue(desc.contains("Sprinkles"));
    }
    @Test
    void testContainerGetterSetter() {
        IceCream iceCream = new IceCream("Vanilla", 3.5, "Small", "Bowl");
        assertEquals("Bowl", iceCream.getContainer());

        iceCream.setContainer("Cone");
        assertEquals("Cone", iceCream.getContainer());
    }
}