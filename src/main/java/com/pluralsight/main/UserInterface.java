package com.pluralsight.main;

import com.pluralsight.order.Order;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Order order;
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
                case 1 -> addPizza();
                case 3 -> System.out.println("Have a saucy day :)!");
                default -> System.out.println("Invalid choice!");
            }
        }
        scanner.close();

    }

    public static void addPizza() {
        System.out.println("Pick a size:");
        System.out.println("1. 8 in.");
        System.out.println("2. 12 in.");
        System.out.println("3. 16 in.");

        int input = Integer.parseInt(scanner.nextLine());
    }
}
