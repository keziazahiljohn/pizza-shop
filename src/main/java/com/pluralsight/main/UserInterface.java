package com.pluralsight.main;

import com.pluralsight.order.BreadSide;
import com.pluralsight.order.Drink;
import com.pluralsight.order.Order;
import com.pluralsight.order.Pizza;
import com.pluralsight.toppings.*;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static Order currentOrder;

    public static void main(String[] args) {
        currentOrder = new Order();
        int choice = -1;
        while (choice != 2) {
            System.out.println("\nWelcome to Kezia's Pizza Shop!");
            System.out.println("1. New Order");
            System.out.println("2. Exit");
            System.out.print("Your choice: ");

            if (!scanner.hasNextInt()) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter 1 or 2.");
                    scanner.nextLine();
                }
            }
            choice = scanner.nextInt();
            scanner.nextLine();                     // clear newline

            switch (choice) {
                case 1 -> orderMenu();
                case 2 -> System.out.println("Have a saucy day :)!");
                default -> System.out.println("Invalid choice!");
            }
        }
        scanner.close();

    }

    public static void orderMenu() {
        boolean ordering = true;

        while (ordering) {
            System.out.println("Order Menu:");
            System.out.println("1. Add Pizza");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Bread Side");
            System.out.println("4. Get a Combo Meal");
            System.out.println("5. Checkout");
            System.out.println("0. Cancel Order");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter 1 or 2.");
                scanner.nextLine();                 // discard bad input
            }
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1 -> addPizza();
                case 2 -> addDrink();
                case 3 -> addBreadSide();
                case 4 -> comboMeal();
                case 5 -> currentOrder.printOrder();
            }
        }
    }

    public static void addPizza() {
        Scanner scanner = new Scanner(System.in);
        // Pizza Size
        System.out.println("Pick a size:");
        System.out.println("1. 8 in.");
        System.out.println("2. 12 in.");
        System.out.println("3. 16 in.");

        int pizzaChoice = Integer.parseInt(scanner.nextLine());

        int size = 0;

        switch (pizzaChoice) {
            case 1 -> {
                size = 8;
            }
            case 2 -> {
                size = 12;
            }
            case 3 -> {
                size = 16;
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
        System.out.println("4. Cauliflower");
        int crustInput = Integer.parseInt(scanner.nextLine());

        String crustType = "nothing";

        switch (crustInput) {
            case 1 -> {
                crustType = "Thin";
            }
            case 2 -> {
                crustType = "Regular";
            }
            case 3 -> {
                crustType = "Thick";
            }
            case 4 -> {
                crustType = "Cauliflower";
            }
        }

        // Stuffed Crust
        System.out.println("Stuffed crust? (yes/no)");
        String wantStuffedCrust = scanner.nextLine();

        boolean stuffedCrust = wantStuffedCrust.equalsIgnoreCase("yes");

        // Toppings
        ArrayList<Topping> toppings = new ArrayList<>();
        boolean addingToppings = true;

        while (addingToppings) {
            System.out.println("Choose a topping:");
            System.out.println("1. Onions\n" +
                    "2. Mushrooms\n" +
                    "3. Bell Peppers\n" +
                    "4. Olives\n" +
                    "5. Tomatoes\n" +
                    "6. Spinach\n" +
                    "7. Basil\n" +
                    "8. Pineapple\n" +
                    "9. Anchovies\n" +
                    "0. Done\n");

            int topping = Integer.parseInt(scanner.nextLine());

            switch (topping) {
                case 1 -> {
                    toppings.add(new RegularTopping("Onions"));
                }

                case 2 -> {
                    toppings.add(new RegularTopping("Mushrooms"));
                }

                case 3 -> {
                    toppings.add(new RegularTopping("Bell Peppers"));
                }

                case 4 -> {
                    toppings.add(new RegularTopping("Olives"));
                }

                case 5 -> {
                    toppings.add(new RegularTopping("Tomatoes"));
                }

                case 6 -> {
                    toppings.add(new RegularTopping("Spinach"));
                }

                case 7 -> {
                    toppings.add(new RegularTopping("Basil"));
                }

                case 8 -> {
                    toppings.add(new RegularTopping("Pineapple"));
                }

                case 9 -> {
                    toppings.add(new RegularTopping("Anchovies"));
                }

                case 0 -> {
                    addingToppings = false;
                }
                default -> {
                    System.out.println("Invalid Topping");
                    continue;
                }
            }
        }

        // sides
        boolean addingSideToppings = true;
        while (addingSideToppings) {
            System.out.println("Choose a side topping:");
            System.out.println("1. Red Pepper\n" + "2. Parmesan\n" + "3. Done");
            int sideToppings = Integer.parseInt(scanner.nextLine());

            switch (sideToppings) {
                case 1 -> {
                    toppings.add(new Side("Red Pepper"));
                }
                case 2 -> {
                    toppings.add(new Side("Parmesan"));
                }
                case 3 -> {
                    addingSideToppings = false;
                }
                default -> {
                    System.out.println("Invalid Topping");
                    continue;
                }
            }
        }

        // sauces

        boolean addingSauces = true;
        while (addingSauces) {
            System.out.println("Choose a sauce:");
            System.out.println("1. Marinara\n" +
                    "2. Alfredo\n" +
                    "3. Pesto\n" +
                    "4. BBQ\n" +
                    "5. Buffalo\n" +
                    "6. Olive Oil\n");

            int sauce = Integer.parseInt(scanner.nextLine());

            switch (sauce) {
                case 1 -> {
                    toppings.add(new Sauce("Marinara"));
                }
                case 2 -> {
                    toppings.add(new Sauce("Alfredo"));
                }
                case 3 -> {
                    toppings.add(new Sauce("Pesto"));
                }
                case 4 -> {
                    toppings.add(new Sauce("BBQ"));
                }
                case 5 -> {
                    toppings.add(new Sauce("Buffalo"));
                }
                case 6 -> {
                    toppings.add(new Sauce("Olive Oil"));
                }
                case 0 -> {
                    addingSauces = false;
                }
                default -> {
                    System.out.println("Invalid Topping");
                    continue;
                }
            }
        }

        // premium
        // cheese
        boolean pickingCheese = true;
        while (pickingCheese) {
            System.out.println("Pick a cheese:");
            System.out.println("1. Mozzarella\n" +
                    "2. Parmesan\n" +
                    "3. Ricotta\n" +
                    "4. Goat Cheese\n" +
                    "5. Buffalo\n" +
                    "0. Done");

            int cheeseInput = Integer.parseInt(scanner.nextLine());

            switch (cheeseInput) {
                case 1 -> {
                    toppings.add(new Cheese("Mozzarella", askExtra()));
                }
                case 2 -> {
                    toppings.add(new Cheese("Parmesan", askExtra()));
                }
                case 3 -> {
                    toppings.add(new Cheese("Ricotta", askExtra()));
                }
                case 4 -> {
                    toppings.add(new Cheese("Goat Cheese", askExtra()));
                }
                case 5 -> {
                    toppings.add(new Cheese("Buffalo", askExtra()));
                }
                case 0 -> {
                    pickingCheese = false;
                }
                default -> {
                    System.out.println("Invalid Topping");
                    continue;
                }
            }
        }

        // meat
        boolean pickingMeat = true;
        while (pickingMeat) {
            System.out.println("Pick a cheese:");
            System.out.println("1. Pepperoni\n" +
                    "2. Sausage\n" +
                    "3. Ham\n" +
                    "4. Bacon\n" +
                    "5. Chicken\n" +
                    "6. Meatball\n" +
                    "0. Done\n");

            int cheeseInput = Integer.parseInt(scanner.nextLine());

            switch (cheeseInput) {
                case 1 -> {
                    toppings.add(new Meat("Pepperoni", askExtra()));
                }
                case 2 -> {
                    toppings.add(new Meat("Sausage", askExtra()));
                }
                case 3 -> {
                    toppings.add(new Meat("Ham", askExtra()));
                }
                case 4 -> {
                    toppings.add(new Meat("Bacon", askExtra()));
                }
                case 5 -> {
                    toppings.add(new Meat("Chicken", askExtra()));
                }
                case 6 -> {
                    toppings.add(new Meat("Meatball", askExtra()));
                }
                case 0 -> {
                    pickingMeat = false;
                }
                default -> {
                    System.out.println("Invalid Topping");
                    continue;
                }
            }
        }

        Pizza pizza = new Pizza(size, crustType, stuffedCrust, toppings);

        currentOrder.addPizzaToOrder(pizza);
        System.out.println("Pizza added!");
    }

    public static boolean askExtra() {
        while (true) {
            System.out.println("Do you want extra? (y/n)");

            String input = scanner.nextLine();


            if (input.equalsIgnoreCase("y")) {
                return true;
            }

            if (input.equalsIgnoreCase("n")) {
                return false;
            }

        }

        return extra;
    }

    public static void addDrink() {
        boolean choosingDrink = true;
        while (choosingDrink) {
            System.out.println("Choose a drink!");
            System.out.println("1. Pepsi\n" +
                    "2. Coke\n" +
                    "3. Dr. Pepper\n" +
                    "4. Mt. Dew\n" +
                    "5. Sprite\n" +
                    "6. Cherry Coke\n" +
                    "7. Ginger Ale\n" +
                    "0. Done");

            int drinkInput = Integer.parseInt(scanner.nextLine());

            String flavor = "";
            switch (drinkInput) {
                case 1 -> {
                    flavor = "Pepsi";
                }
                case 2 -> {
                    flavor = "Coke";
                }
                case 3 -> {
                    flavor = "Dr. Pepper";
                }
                case 4 -> {
                    flavor = "Mt. Dew";
                }
                case 5 -> {
                    flavor = "Sprite";
                }
                case 6 -> {
                    flavor = "Cherry Coke";
                }
                case 7 -> {
                    flavor = "Ginger Ale";
                }
                case 0 -> {
                    choosingDrink = false;
                    continue;
                }
                default -> {
                    System.out.println("Invalid Drink.");
                }
            }

            System.out.println("What drinkSize?");
            System.out.println("1. Small");
            System.out.println("2. Medium");
            System.out.println("3. Large");
            int drinkSize = Integer.parseInt(scanner.nextLine());
            char size = 'S';
            switch (drinkSize) {
                case 1 -> {
                    size = 'S';
                }
                case 2 -> {
                    size = 'M';
                }
                case 3 -> {
                    size = 'L';
                }
                default -> {
                    System.out.println("Invalid size input.");
                }
            }

            currentOrder.addDrinkToOrder(new Drink(flavor, size));
            System.out.println("Drink added!");
        }
    }

    public static void addBreadSide() {
        boolean choosingBreadSide = true;
        while (choosingBreadSide) {
            System.out.println("Choose a bread side:");
            System.out.println("1. Garlic Knots");
            System.out.println("2. Pizza Twists");
            System.out.println("3. Cinnamon Twists");
            System.out.println("0. Done");

            int breadInput = Integer.parseInt(scanner.nextLine());

            switch (breadInput) {
                case 1 -> {
                    currentOrder.addBreadSideToOrder(new BreadSide("Garlic Knots"));
                }
                case 2 -> {
                    currentOrder.addBreadSideToOrder(new BreadSide("Pizza Twists"));
                }
                case 3 -> {
                    currentOrder.addBreadSideToOrder(new BreadSide("Cinnamon Twists"));
                }
                case 0 -> {
                    choosingBreadSide = false;
                }
                default -> {
                    System.out.println("Invalid bread side.");
                    continue;
                }
            }
            System.out.println("Bread side added!");
        }
    }

    public static void comboMeal() {
        System.out.println("Choose a combo meal!\n");

        System.out.println("1. Family Pizza Deal   -   $30.00");
        System.out.println("- 1 16\" pie");
        System.out.println("- 2 bread sides");
        System.out.println("- 2 large drinks\n");

        System.out.println("2. Single Meal Deal   -   $7.00");
        System.out.println("- 2 slices from an 8\" pie");
        System.out.println("- any bread side");
        System.out.println("- 1 medium drink");

        System.out.println("3. Duo Deal   -   $10.00");
        System.out.println("- 1/2 8\" pie");
        System.out.println("- any bread side");
        System.out.println("- 2 small drinks");

        int comboChoice = Integer.parseInt(scanner.nextLine());

        switch (comboChoice) {
            case 1 -> {
                ArrayList<Topping> toppings = new ArrayList<>();

                Pizza pizza = new Pizza(16, "Regular", false, toppings);

                currentOrder.addPizzaToOrder(pizza);

                System.out.println("Choose first bread side:");
                addBreadSide();

                System.out.println("Choose second bread side:");
                addBreadSide();

                currentOrder.addDrinkToOrder(new Drink("Pepsi", 'L'));

                currentOrder.addDrinkToOrder(new Drink("Pepsi", 'L'));

                System.out.println("Family Deal added!");
            }

            case 2 -> {
                ArrayList<Topping> toppings = new ArrayList<>();

                Pizza pizza = new Pizza(8, "Regular", false, toppings);

                currentOrder.addPizzaToOrder(pizza);

                System.out.println("Choose a bread side:");
                addBreadSide();

                currentOrder.addDrinkToOrder(new Drink("Pepsi", 'M'));

                System.out.println("Single Meal Deal added!");
            }

            case 3 -> {
                ArrayList<Topping> toppings = new ArrayList<>();

                Pizza pizza = new Pizza(8, "Regular", false, toppings);

                currentOrder.addPizzaToOrder(pizza);

                System.out.println("Choose a bread side:");
                addBreadSide();

                currentOrder.addDrinkToOrder(new Drink("Pepsi", 'S'));

                currentOrder.addDrinkToOrder(new Drink("Pepsi", 'S'));

                System.out.println("Duo Deal added!");
            }

            default -> System.out.println("Invalid combo.");
        }
    }
}
