package com.pluralsight.ui;

import com.pluralsight.models.IceCream;
import com.pluralsight.util.Order;
import com.pluralsight.models.MenuItem;

import java.awt.*;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Order order;

    public void showIntro() {
        String[] intro = {
                "__          __  _                            _ \n" +
                        "\\ \\        / / | |                          | |\n" +
                        " \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |\n" +
                        "  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | |\n" +
                        "   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ |_|\n" +
                        "    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___| (_)\n" +
                        "                                               \n" +
                        "                                                       \n" +
                        "           🍦 to FirstBytes Creamery 🍦     \n"};
        for (String line : intro) {
            System.out.println(line);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("\nLoading Shop");
        try {
            for (int i = 0; i < 15; i++) {
                Thread.sleep(300);
                System.out.print("|");
            }
        } catch (InterruptedException e) {
        }

        System.out.println("\n Shop Ready!\n");
    }

    public void start() {
        showIntro();

        boolean running = true;
        while (running) {

            System.out.println("======== Home Screen ========");
            System.out.println("1) Order");
            System.out.println("0) Exit");
            System.out.printf("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> newOrder();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public void newOrder() {
        order = new Order();
        boolean ordering = true;

        while (ordering) {
            System.out.println("======== Order menu ========");
            System.out.println("1) Order Ice cream");
            System.out.println("2) Order Smoothie");
            System.out.println("3) Order Ice cream Cake");
            System.out.println("4) CheckOut");
            System.out.println("0) Cancel");
            System.out.printf("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> orderIceCream();
                case 2 -> orderSmoothie();
                case 3 -> orderIceCreamCake();
                case 4 -> checkout();
                case 0 -> {
                    System.out.println("Order cancelled");
                    ordering = false;
                }
                default -> System.out.println("Invalid choice");
            }

        }
    }

    public void orderIceCream() {
        try {
            System.out.println("Enter Cone/Bowl:");
            String container = scanner.nextLine();

            if (container.equalsIgnoreCase("cone")) {
                System.out.println("You chose a Cone!");
            } else if (container.equalsIgnoreCase("bowl")) {
                System.out.println("You chose a Bowl!");
            } else {
                System.out.println("Invalid option. Please enter Cone or Bowl.");
            }

            System.out.println("Enter Size (Small, Medium, Large):");
            String size = scanner.nextLine();

            double basePrice = switch (size.toLowerCase()) {
                case "small" -> 3.50;
                case "medium" -> 4.50;
                case "large" -> 5.50;
                default -> 4.50;
            };

            IceCream iceCream = new IceCream("Ice Cream", basePrice, size, container);

    }
}


