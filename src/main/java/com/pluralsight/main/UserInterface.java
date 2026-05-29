package com.pluralsight.main;

import com.pluralsight.order.Order;
import com.pluralsight.order.Pizza;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Order currentOrder;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 2) {
            System.out.println("\nWelcome to Kezia's Pizza Shop!");
            System.out.println("1. Start Ordering");
            System.out.println("2. Exit");
            System.out.print("Your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter 1 or 2.");
                scanner.nextLine();                 // discard bad input
                continue;
            }
            choice = scanner.nextInt();
            scanner.nextLine();                     // clear newline

            switch (choice) {
                case 1 -> System.out.println("jk");// placeholder;
                case 3 -> System.out.println("Have a saucy day :)!");
                default -> System.out.println("Invalid choice!");
            }
        }
        scanner.close();

    }

    public void addPizza() {
        // Pizza Size
        System.out.println("Pick a size:");
        System.out.println("1. 8 in.");
        System.out.println("2. 12 in.");
        System.out.println("3. 16 in.");

        int pizzaChoice = Integer.parseInt(scanner.nextLine());

        int size = 0;
        double price = 0.0;

        switch (pizzaChoice) {
            case 1 -> {
                size = 8;
                price = 8.50;
            }
            case 2 -> {
                size = 12;
                price = 12.00;
            }
            case 3 -> {
                size = 16;
                price = 16.50;
            }
            default -> {
                System.out.println("Invalid size.");
                return;
            }
        }

        // Crust Type
        System.out.println("Choose a crust type:");
        System.out.println("1. Thin");
        System.out.println("2. Regular");
        System.out.println("3. Thick");
        int crustInput = Integer.parseInt(scanner.nextLine());

        String crustType;

        switch (crustInput) {
            case 1 -> {
                crustType = "thin";
            }
            case 2 -> {
                crustType = "regular";
            }
            case 3 -> {
                crustType = "thick";
            }
        }

        System.out.println("Stuffed crust? (yes/no)");
        String stuffedCrust = scanner.nextLine();

        if (stuffedCrust.equalsIgnoreCase("yes")){

        }
    }
}
