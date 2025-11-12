package com.pluralsight.util;

import com.pluralsight.models.MenuItem;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.Assert.*;

public class ReceiptTest {

    @Test
    void testSaveReceiptCreatesFile() {
        Order order = new Order();
        MenuItem item = new MenuItem("Ice Cream", 3.5, "Small");
        order.addMenuItem(item);

        Receipt receipt = new Receipt(order);
        receipt.saveReceipt();

        File file = new File("receipt.txt");
        assertTrue(file.exists());
        assertTrue(file.length() > 0);
    }
}
