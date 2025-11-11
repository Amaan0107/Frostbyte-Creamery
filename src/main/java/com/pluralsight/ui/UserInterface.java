package com.pluralsight.ui;

import com.pluralsight.models.IceCream;
import com.pluralsight.models.IceCreamCake;
import com.pluralsight.models.Smoothie;
import com.pluralsight.util.Order;
import com.pluralsight.models.MenuItem;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Order order;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void showIntro() {
        String[] intro = {
             " ██╗    ██╗███████╗██╗     ██████╗  ██████╗ ███╗   ███╗███████╗"+
             " ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝"+
              "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗"+
              "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝"+
              "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗"+
               "╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝" +
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
            pause(100);
            System.out.println("1) Order");
            pause(100);
            System.out.println("0) Exit");
            pause(100);
            System.out.printf("Enter your choice: ");
            pause(100);
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> newOrder();
                case 0 -> {
                    if (running = false){
                        System.out.println("Please visit FrostBytes again !!!");
                    }
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public void newOrder() {
        order = new Order();
        boolean ordering = true;

        while (ordering) {
            System.out.println("======== Order menu ========");
            pause(100);
            System.out.println("1) Order Ice cream");
            pause(100);
            System.out.println("2) Order Smoothie");
            pause(100);
            System.out.println("3) Order Ice cream Cake");
            pause(100);
            System.out.println("4) CheckOut");
            pause(100);
            System.out.println("0) Cancel");
            pause(100);
            System.out.printf("Enter your choice: ");
            pause(100);
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> orderIceCream();
                case 2 -> orderSmoothie();
                case 3 -> orderIceCreamCake();
                case 4 -> {
                    if (!checkout()){
                        ordering = false;
                    }
                }
                case 0 -> {
                    System.out.println("Order cancelled");
                    ordering = false;
                }
                default -> System.out.println("Invalid choice");
            }

        }
    }

    public void orderIceCream() {
        String container = null;
        try {
            pause(100);
            System.out.println("Enter Cone/Bowl:");
            container = scanner.nextLine();

            if (container.equalsIgnoreCase("cone")) {
                pause(100);
                System.out.println("You chose a Cone!");
            } else if (container.equalsIgnoreCase("bowl")) {
                pause(100);
                System.out.println("You chose a Bowl!");
            } else {
                System.out.println("Invalid option. Please enter Cone or Bowl.");
            }
        } catch (Exception e) {
            System.out.println("Invalid option.");
        }

        try {
            pause(100);
            System.out.println("Enter Size (Small, Medium, Large):");
            String size = scanner.nextLine();

            double basePrice = switch (size.toLowerCase()) {
                case "small" -> 3.50;
                case "medium" -> 4.50;
                case "large" -> 5.50;
                default -> 4.50;
            };

            IceCream iceCream = new IceCream("Ice Cream", basePrice, size, container);

            pause(100);
            System.out.println("Enter the flavors you want (separate by commas):");
            String inputFlavors = scanner.nextLine();
            String[] flavors = inputFlavors.split(",");
            for (String flavor : flavors) {
                iceCream.addTopping(flavor.trim());
            }

            pause(100);
            System.out.println("Enter up to 3 toppings (separate by commas, or leave empty):");
            String inputToppings = scanner.nextLine();
            if (!inputToppings.isBlank()) {
                String[] toppings = inputToppings.split(",");
                for (String topping : toppings) {
                    iceCream.addTopping(topping.trim());
                }
            }
            pause(100);
            System.out.println("Add extra toppings? (y/n):");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                pause(100);
                System.out.println("Enter extra toppings (separate by commas):");
                String inputExtraToppings = scanner.nextLine();
                if (!inputExtraToppings.isBlank()) {
                    String[] extraToppings = inputExtraToppings.split(",");
                    for (String topping : extraToppings) {
                        iceCream.addTopping(topping.trim());
                        iceCream.setPrice(iceCream.getPrice() + 0.50);
                    }
                    pause(100);
                    System.out.println(" Added extra toppings: " + String.join(", ", extraToppings));
                    System.out.printf("New price: $%.2f\n", iceCream.getPrice());
                }
            }
            order.addMenuItem(iceCream);
            pause(100);
            System.out.println(" Ice Cream added to your order!");
        }catch (Exception e) {
            System.out.println("Invalid option.");
        }
    }

    public void orderSmoothie() {
        try {
            pause(100);
            System.out.println("Enter Size (Small, Medium, Large):");
            String size = scanner.nextLine();

            double basePrice = switch (size.toLowerCase()) {
                case "small" -> 5.55;
                case "medium" -> 6.50;
                case "large" -> 7.10;
                default -> 5.50;
            };
            Smoothie smoothie = new Smoothie("smoothie", basePrice, size);

            pause(100);
            System.out.println("Enter the flavor:");
            String inputFlavors = scanner.nextLine().trim();

            if(!inputFlavors.isBlank()) {
               smoothie.addTopping(inputFlavors.trim());
            }else  {
                System.out.println("Invalid option. Please enter a valid flavor.");
            }

            pause(100);
            System.out.println("Add extra toppings? (y/n):");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                pause(100);
                System.out.println("Enter extra toppings (separate by commas):");
                String inputExtraToppings = scanner.nextLine();
                if (!inputExtraToppings.isBlank()) {
                    String[] extraToppings = inputExtraToppings.split(",");
                    for (String topping : extraToppings) {
                        smoothie.addTopping(topping.trim());
                        smoothie.setPrice(smoothie.getPrice() + 0.50);
                    }
                    pause(100);
                    System.out.println(" Added extra toppings: " + String.join(", ", extraToppings));
                    System.out.printf("New price: $%.2f\n", smoothie.getPrice());
                }
            }
            order.addMenuItem(smoothie);
            pause(100);
            System.out.println(" Smoothie added to your order!");
        }catch (Exception e) {
            System.out.println("Invalid option.");
        }
    }

    public void orderIceCreamCake() {
        try {
            pause(100);
            System.out.println("Enter Size (Small, Medium, Large):");
            String size = scanner.nextLine().trim();

            double basePrice = switch (size.toLowerCase()) {
                case "small" -> 12.00;
                case "medium" -> 16.50;
                case "large" -> 22.50;
                default -> 12.00;
            };
            IceCreamCake cake = new IceCreamCake("Ice Cream Cake", basePrice, size);
            order.addMenuItem(cake);
            pause(100);
            System.out.println(" Ice Cream Cake added to your order!");
        }catch (Exception e) {
            System.out.println("Invalid option.");
        }
    }

    private boolean checkout() {
        try{
        System.out.println("\n======== Checkout ========");
        if (order.getMenuItems().isEmpty()) {
            pause(100);
            System.out.println("No items in order!");
            return true;
        }

        order.getMenuItems().stream()
                .map(MenuItem::getDescription)
                .forEach(System.out::println);
        pause(300);
        System.out.println("Calculating your total!");
        pause(500);
        System.out.printf("Total: $%.2f\n", order.CalculatePrice());
        System.out.println("Thank you for your order!\n");
    }catch (Exception e) {
        System.out.println("Invalid option.");}
        return false;
    }

    private void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
        }
    }
    public void shopMenu(){
        String[] menu = {

                 " ███╗   ███╗███████╗███╗   ██╗██╗   ██╗"+
                 " ████╗ ████║██╔════╝████╗  ██║██║   ██║"+
                  "██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║"+
                  "██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║"+
                 " ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝"+
                  "╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ "
               };
        for (String line : menu) {
            System.out.println(line);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }
}



