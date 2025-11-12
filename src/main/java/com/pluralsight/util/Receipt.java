package com.pluralsight.util;

import com.pluralsight.models.MenuItem;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

public class Receipt {
    private static final String FILE_NAME = "receipt.txt";
    private final Order order;

    public Receipt(Order order) {
        this.order = order;
    }

    public void saveReceipt() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            writer.println("Order Date: " + order.getOrderDate().format(dateFormatter));
            writer.println("----------------------------------");

            for (MenuItem item : order.getMenuItems()) {
                writer.println(item.getDescription());
            }

            writer.printf("Total: $%.2f%n", order.CalculatePrice());
            writer.println("==================================\n");

            System.out.println("Receipt saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}
