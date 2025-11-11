package com.pluralsight.ui;

import com.pluralsight.models.IceCream;
import com.pluralsight.models.IceCreamCake;
import com.pluralsight.models.Smoothie;
import com.pluralsight.util.Order;
import com.pluralsight.models.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class UserInterface {

    private Scanner scanner;
    private Order order;

    private final List<String> iceCreamFlavors = Arrays.asList(
            "Chocolate", "Vanilla", "Strawberry", "Mint Chocolate Chip",
            "Cookies & Cream", "Rocky Road", "Pistachio", "Salted Caramel",
            "Mango", "Coffee"
    );
    private final List<String> smoothieFlavors = Arrays.asList(
            "Berry Blast", "Tropical Mango", "Green Detox",
            "Banana Peanut Butter", "Chocolate Banana"
    );
    private final List<String> cakeFlavors = Arrays.asList(
            "Chocolate Fudge Brownie", "Cookies & Cream Delight",
            "Strawberry Shortcake", "Mint Chocolate Chip Crunch",
            "Salted Caramel Pretzel"
    );
    private final List<String> toppingsList = Arrays.asList(
            "Chocolate Syrup", "Caramel Syrup", "Strawberry Syrup", "Hot Fudge",
            "Whipped Cream", "Sprinkles", "Choco Chips", "Crushed Oreos",
            "KitKat Pieces", "Gummy Bears"
    );


    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void showIntro() {
        String[] intro = {
             " ██╗    ██╗███████╗██╗     ██████╗  ██████╗ ███╗   ███╗███████╗",
             " ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝",
              "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗",
               "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝",
              "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗",
               "╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝" ,
                        "           🍦 to FirstBytes Creamery 🍦     \n"};
        for (String line : intro) {
            System.out.println(line);
            try {
                Thread.sleep(300);
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
        try {

            boolean running = true;
            while (running) {

                System.out.println("======== Home Screen ========");
                System.out.println("1) Order");
                System.out.println("0) Exit");
                System.out.printf("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> newOrder();
                    case 0 -> {
                        if (running = false) {
                            System.out.println("Please visit FrostBytes again !!!");
                        }
                    }
                    default -> System.out.println("Invalid choice");
                }
            }
        }catch (Exception e) {
            System.out.println("Invalid choice");
        }
    }

    public void newOrder() {
        try {
            order = new Order();
            boolean ordering = true;

            while (ordering) {
                System.out.println("======== Order menu ========");
                System.out.println("1) Order Ice cream");
                System.out.println("2) Order Smoothie");
                System.out.println("3) Order Ice cream Cake");
                System.out.println("4) CheckOut");
                System.out.println("5) Menu");
                System.out.println("0) Cancel");
                System.out.printf("Enter your choice: ");;
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> orderIceCream();
                    case 2 -> orderSmoothie();
                    case 3 -> orderIceCreamCake();
                    case 4 -> {
                        if (!checkout()) {
                            ordering = false;
                        }
                    }
                    case 5 -> shopMenu();
                    case 0 -> {
                        System.out.println("Order cancelled");
                        ordering = false;
                    }
                    default -> System.out.println("Invalid choice");
                }

            }
        }catch (Exception e) {
            System.out.println("Invalid choice");
        }
    }

    public void orderIceCream() {
        String container = null;
        try {
            pause(100);
            System.out.println("Enter Cone/Bowl:");
            container = scanner.nextLine();

            if (container.equalsIgnoreCase("cone")) {
                System.out.println("You chose a Cone!");
            } else if (container.equalsIgnoreCase("bowl")) {
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
            int maxToppings = 0;
            switch (size) {
                case "small":
                    maxToppings = 1;
                    break;
                case "medium":
                    maxToppings = 2;
                    break;
                case "large":
                    maxToppings = 3;
                    break;
                default:
                    System.out.println("Invalid size. Defaulting to small.");
                    maxToppings = 1;
            }
            int maxFlavors = 0;
            switch (size) {
                case "small":
                    maxFlavors = 1;
                    break;
                case "medium":
                    maxFlavors = 2;
                    break;
                case "large":
                    maxFlavors = 3;
                    break;
                default:
                    System.out.println("Invalid size. Defaulting to small.");
                    maxFlavors = 1;
            }
            System.out.println("You may choose up to " + maxFlavors + " flavors.");
            System.out.println("You may choose up to " + maxToppings + " toppings.");

            IceCream iceCream = new IceCream("Ice Cream", basePrice, size, container);
            try {
                pause(100);
                List<String> flavors = new ArrayList<>();
                for (int i = 0; i < maxFlavors; i++) {
                    while (true) {
                        System.out.printf("Enter Flavors (separate with\",\"): ", i + 1);
                        String input = scanner.nextLine().trim();

                        if (input.isEmpty()) {
                            break;
                        }

                        String[] chosen = input.split(",\\s*");
                        if (chosen.length > 1) {
                            System.out.printf("You can only add %d flavors(s) for %s size. Please enter again.\n",
                                    maxFlavors - i, size);
                            continue;
                        }

                        flavors.add(i, chosen[0]);
                        break;

                    }
                    System.out.println("Ice cream Added!");
                }
            }catch (Exception e){
                System.out.println("Invalid option. ");
            }
            try {
                pause(100);
                for (int i = 0; i < maxToppings; i++) {
                    List<String> toppings = new ArrayList<>();
                    while (true) {
                        System.out.printf("Enter toppings (separate with\",\"): ", i + 1);
                        String input = scanner.nextLine().trim();

                        if (input.isEmpty()) {
                            break;
                        }

                        String[] chosen = input.split(",\\s*");
                        if (chosen.length > 1) {
                            System.out.printf("You can only add %d topping(s) for %s size. Please enter again.\n",
                                    maxToppings - i, size);
                            continue;
                        }

                        toppings.add(i, chosen[0]);
                        break;
                    }
                    System.out.println("Topping added!");
                }
            }catch (Exception e){
                System.out.println("Invalid option. ");
            }

            pause(100);
            System.out.println("Add extra toppings? (y/n):");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                pause(100);
                System.out.println("Enter extra toppings (separate with\",\"):");
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
            System.out.println("Enter the flavors (separate with\",\"):");
            String inputFlavors = scanner.nextLine().trim();

            if (!inputFlavors.isBlank()) {
                smoothie.addTopping(inputFlavors.trim());
            } else {
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

            System.out.println("Enter the flavor (separate with\",\"):");
            String inputFlavors = scanner.nextLine().trim();

            if(!inputFlavors.isBlank()) {
                cake.addTopping(inputFlavors.trim());
            }else  {
                System.out.println("Invalid option. Please enter a valid flavor.");
            }
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
    private String askSize() {
        String size = "";
        while (true) {
            try {
                System.out.print("Enter size (Small/Medium/Large): ");
                size = scanner.nextLine().trim();
                if (!size.equalsIgnoreCase("Small") && !size.equalsIgnoreCase("Medium") && !size.equalsIgnoreCase("Large")) {
                    throw new Exception("Invalid size choice.");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter Small, Medium, or Large.");
            }
        }
        return size;
    }
    private void chooseFlavorsWithValidation(MenuItem item, List<String> available, int max) {
        while (true) {
            try {
                System.out.println("Choose up to " + max + " flavor(s), separated by commas:");
                String input = scanner.nextLine().trim();
                String[] chosen = input.split(",\\s*");
                item.getFlavors().clear();
                for (int i = 0; i < Math.min(max, chosen.length); i++) {
                    if (!available.contains(chosen[i].trim())) {
                        throw new Exception("Invalid flavor choice: " + chosen[i].trim());
                    }
                    item.addFlavor(chosen[i].trim());
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please choose flavors from the list.");
            }
        }
    }
    private void chooseToppingsWithValidation(MenuItem item, int max) {
        while (true) {
            try {
                System.out.println("Choose up to " + max + " topping(s), separated by commas:");
                String input = scanner.nextLine().trim();
                String[] chosen = input.split(",\\s*");
                item.getToppings().clear();
                for (int i = 0; i < Math.min(max, chosen.length); i++) {
                    if (!toppingsList.contains(chosen[i].trim())) {
                        throw new Exception("Invalid topping choice: " + chosen[i].trim());
                    }
                    item.addTopping(chosen[i].trim());
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please choose toppings from the list.");
            }
        }
    }
    private void extraToppings(MenuItem item) {
        try {
            System.out.print("Add extra toppings for $0.50 each? (y/n): ");
            if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
                System.out.println("Enter extra toppings, separated by commas:");
                String input = scanner.nextLine().trim();
                String[] extra = input.split(",\\s*");
                for (String t : extra) {
                    if (!t.isEmpty()) {
                        item.addTopping(t);
                        item.setPrice(item.getPrice() + 0.50);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error adding extra toppings.");
        }
    }

    private void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
        }
    }

    public void shopMenu(){
        String[] menu = {

                 " ███╗   ███╗███████╗███╗   ██╗██╗   ██╗",
                 " ████╗ ████║██╔════╝████╗  ██║██║   ██║",
                  "██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║",
                  "██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║",
                 " ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝",
                  "╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ "
               };
        for (String line : menu) {
            System.out.println(line);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("\n Ice Cream Size/Price");
        System.out.println("------------------------------------------------------------");
        System.out.println("  Small      $3.50     (1 scoop, 1 topping max)");
        System.out.println("  Medium     $4.50     (2 scoops, 2 toppings max)");
        System.out.println("  Large      $5.50     (3 scoops, 3 toppings max)");
        System.out.println("=============================================================");
        System.out.println("\n Smoothie Size/Price");
        System.out.println("------------------------------------------------------------");
        System.out.println("  Small      $5.55  ");
        System.out.println("  Medium     $6.50  ");
        System.out.println("  Large      $7.10  ");
        System.out.println("=============================================================");
        System.out.println("\n Cake Size/Price/flavors");
        System.out.println("------------------------------------------------------------");
        System.out.println("  Small      $12.00");
        System.out.println("  Medium     $16.50");
        System.out.println("  Large      $22.50");
        System.out.println("=============================================================");
        System.out.println("\n Toppings");
        System.out.println("------------------------------------------------------------");
        System.out.println("(Extra toppings are unlimited but cost .50 per topping)");
        System.out.println("=============================================================");
        pause(400);
    }
}





