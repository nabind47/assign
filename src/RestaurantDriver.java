import java.util.Scanner;

public class RestaurantDriver {
    public static void main(String[] args) {
        // Create menus
        Menu takeAwayMenu = new Menu(1, "Take-Away Menu", "Take Away", "Various Venues", "All Day");
        Menu dineInMenu = new Menu(2, "Dine-In Menu", "Dine-In", "Main Venue", "All Day");

        // STANDARD MENU
        StandardMenuItem standardMenu1 = new StandardMenuItem(1, "Spaghetti Carbonara",
                "Classic Italian pasta with bacon, eggs, and Parmesan cheese", 12.99, "Pasta");
        StandardMenuItem standardMenu2 = new StandardMenuItem(2, "Classic Burger",
                "Beef patty, lettuce, tomato, onion, and cheese on a sesame seed bun", 9.99, "Burger");
        StandardMenuItem standardMenu3 = new StandardMenuItem(3, "Margherita Pizza",
                "Traditional Italian pizza with tomato sauce, mozzarella cheese, and fresh basil", 11.99, "Pizza");
        StandardMenuItem standardMenu4 = new StandardMenuItem(4, "Caesar Salad",
                "Romaine lettuce, croutons, Parmesan cheese, and Caesar dressing", 8.99, "Salad");
        StandardMenuItem standardMenu5 = new StandardMenuItem(5, "Club Sandwich",
                "Triple-decker sandwich with turkey, bacon, lettuce, tomato, and mayonnaise", 10.99, "Sandwich");
        StandardMenuItem standardMenu6 = new StandardMenuItem(6, "Tomato Basil Soup",
                "Creamy tomato soup with fresh basil leaves", 6.99, "Soup");
        StandardMenuItem standardMenu7 = new StandardMenuItem(7, "Fish and Chips",
                "Battered and deep-fried fish served with French fries", 13.99, "Seafood");
        StandardMenuItem standardMenu8 = new StandardMenuItem(8, "Grilled Ribeye Steak",
                "Juicy ribeye steak cooked to perfection, served with mashed potatoes and vegetables", 19.99, "Steak");
        StandardMenuItem standardMenu9 = new StandardMenuItem(9, "Assorted Sushi Platter",
                "Selection of fresh sushi rolls and nigiri with soy sauce and wasabi", 15.99, "Sushi");
        StandardMenuItem standardMenu10 = new StandardMenuItem(10, "Chicken Tikka Masala",
                "Indian curry dish made with grilled chicken, tomato, and creamy sauce", 14.99, "Curry");

        // PREMIUM MENUS
        PremiumMenuItem premiumMenu1 = new PremiumMenuItem(11, "Lobster Thermidor",
                "Luxurious French dish with lobster meat, cream, brandy, and cheese", 39.99, "Seafood", 20.0);
        PremiumMenuItem premiumMenu2 = new PremiumMenuItem(12, "Wagyu Beef Steak",
                "High-quality Japanese beef steak with marbling and rich flavor", 49.99, "Steak", 25.0);
        PremiumMenuItem premiumMenu3 = new PremiumMenuItem(13, "Truffle Alfredo Pasta",
                "Creamy pasta dish made with truffle oil, Parmesan cheese, and fresh herbs", 29.99, "Pasta", 15.0);
        PremiumMenuItem premiumMenu4 = new PremiumMenuItem(14, "Beluga Caviar",
                "Exquisite delicacy of sturgeon roe, served with blinis and sour cream", 99.99, "Appetizer", 30.0);
        PremiumMenuItem premiumMenu5 = new PremiumMenuItem(15, "Wagyu Burger",
                "Gourmet burger made with wagyu beef, foie gras, and black truffle", 34.99, "Burger", 20.0);
        PremiumMenuItem premiumMenu6 = new PremiumMenuItem(16, "Pan-Seared Foie Gras",
                "Rich and buttery duck liver served with caramelized onions and brioche", 44.99, "Appetizer", 25.0);
        PremiumMenuItem premiumMenu7 = new PremiumMenuItem(17, "Maine Lobster Roll",
                "Fresh Maine lobster meat in a buttered roll, served with fries", 29.99, "Seafood", 15.0);
        PremiumMenuItem premiumMenu8 = new PremiumMenuItem(18, "Wagyu Beef Tacos",
                "Soft corn tortillas filled with wagyu beef, salsa, and avocado", 24.99, "Appetizer", 10.0);
        PremiumMenuItem premiumMenu9 = new PremiumMenuItem(19, "Miso-Glazed Black Cod",
                "Tender black cod marinated in miso, broiled to perfection", 35.99, "Seafood", 20.0);
        PremiumMenuItem premiumMenu10 = new PremiumMenuItem(20, "Lobster Bisque",
                "Creamy soup made with lobster stock, brandy, and cream", 19.99, "Soup", 10.0);

        // DISCOUNT MENU
        DiscountMenuItem discountItem1 = new DiscountMenuItem(21, "Special Veggie Wrap",
                "Grilled vegetables wrapped in lavash bread with hummus and tahini sauce", 7.99, "Wraps");
        DiscountMenuItem discountItem2 = new DiscountMenuItem(22, "Chicken Caesar Salad",
                "Fresh romaine lettuce, grilled chicken, croutons, and Caesar dressing", 9.99, "Salads");
        DiscountMenuItem discountItem3 = new DiscountMenuItem(23, "Margherita Pizza",
                "Traditional Italian pizza with tomato sauce, mozzarella cheese, and fresh basil", 10.99, "Pizza");
        DiscountMenuItem discountItem4 = new DiscountMenuItem(24, "Classic Beef Burger",
                "Grilled beef patty, lettuce, tomato, onion, and cheese on a sesame seed bun", 8.99, "Burgers");
        DiscountMenuItem discountItem5 = new DiscountMenuItem(25, "Vegetable Biryani",
                "Fragrant rice cooked with mixed vegetables, herbs, and spices", 11.99, "Entrees");
        DiscountMenuItem discountItem6 = new DiscountMenuItem(26, "Cheese Quesadilla",
                "Tortilla filled with melted cheese, served with salsa and sour cream", 6.99, "Appetizers");
        DiscountMenuItem discountItem7 = new DiscountMenuItem(27, "Chicken Tikka Masala",
                "Tender chicken pieces in a creamy tomato-based sauce, served with rice", 12.99, "Curries");
        DiscountMenuItem discountItem8 = new DiscountMenuItem(28, "Mediterranean Mezze Platter",
                "Assortment of hummus, tabbouleh, falafel, and pita bread", 14.99, "Appetizers");
        DiscountMenuItem discountItem9 = new DiscountMenuItem(29, "Spaghetti Carbonara",
                "Classic Italian pasta with bacon, eggs, and Parmesan cheese", 11.99, "Pasta");
        DiscountMenuItem discountItem10 = new DiscountMenuItem(30, "Mixed Berry Smoothie",
                "Refreshing blend of mixed berries, yogurt, and honey", 5.99, "Smoothies");

        // DRINK MENU
        DrinkMenuItem drinkItem1 = new DrinkMenuItem(31, "Iced Coffee", "Chilled coffee served with ice cubes", 3.99,
                "Coffee");
        DrinkMenuItem drinkItem2 = new DrinkMenuItem(32, "Fresh Orange Juice",
                "100% natural orange juice, freshly squeezed", 4.99, "Juices");
        DrinkMenuItem drinkItem3 = new DrinkMenuItem(33, "Green Tea", "Japanese green tea, hot or iced", 2.99, "Tea");
        DrinkMenuItem drinkItem4 = new DrinkMenuItem(34, "Mango Lassi", "Indian yogurt-based drink with mango pulp",
                3.99, "Lassi");
        DrinkMenuItem drinkItem5 = new DrinkMenuItem(35, "Classic Lemonade",
                "Refreshing lemon-flavored drink, sweetened", 2.99, "Lemonades");
        DrinkMenuItem drinkItem6 = new DrinkMenuItem(36, "Strawberry Smoothie",
                "Blended smoothie with fresh strawberries and yogurt", 5.99, "Smoothies");
        DrinkMenuItem drinkItem7 = new DrinkMenuItem(37, "Iced Tea",
                "Chilled tea served with ice cubes and lemon slices", 2.99, "Tea");
        DrinkMenuItem drinkItem8 = new DrinkMenuItem(38, "Pineapple Coconut Mocktail",
                "Non-alcoholic tropical drink with pineapple and coconut flavors", 4.99, "Mocktails");
        DrinkMenuItem drinkItem9 = new DrinkMenuItem(39, "Sparkling Water", "Carbonated water with bubbles", 1.99,
                "Water");
        DrinkMenuItem drinkItem10 = new DrinkMenuItem(40, "Blueberry Mojito",
                "Refreshing cocktail made with blueberries, mint, and rum", 7.99, "Cocktails");

        takeAwayMenu.addItem(standardMenu1);
        takeAwayMenu.addItem(standardMenu2);
        takeAwayMenu.addItem(standardMenu3);
        takeAwayMenu.addItem(standardMenu4);
        takeAwayMenu.addItem(standardMenu5);
        takeAwayMenu.addItem(premiumMenu1);
        takeAwayMenu.addItem(premiumMenu2);
        takeAwayMenu.addItem(premiumMenu3);
        takeAwayMenu.addItem(premiumMenu4);
        takeAwayMenu.addItem(premiumMenu5);
        takeAwayMenu.addItem(discountItem1);
        takeAwayMenu.addItem(discountItem2);
        takeAwayMenu.addItem(discountItem3);
        takeAwayMenu.addItem(discountItem4);
        takeAwayMenu.addItem(discountItem5);
        takeAwayMenu.addItem(drinkItem1);
        takeAwayMenu.addItem(drinkItem2);
        takeAwayMenu.addItem(drinkItem3);
        takeAwayMenu.addItem(drinkItem4);
        takeAwayMenu.addItem(drinkItem5);

        dineInMenu.addItem(standardMenu6);
        dineInMenu.addItem(standardMenu7);
        dineInMenu.addItem(standardMenu8);
        dineInMenu.addItem(standardMenu9);
        dineInMenu.addItem(standardMenu10);
        dineInMenu.addItem(premiumMenu6);
        dineInMenu.addItem(premiumMenu7);
        dineInMenu.addItem(premiumMenu8);
        dineInMenu.addItem(premiumMenu9);
        dineInMenu.addItem(premiumMenu10);
        dineInMenu.addItem(discountItem6);
        dineInMenu.addItem(discountItem7);
        dineInMenu.addItem(discountItem8);
        dineInMenu.addItem(discountItem9);
        dineInMenu.addItem(discountItem10);
        dineInMenu.addItem(drinkItem6);
        dineInMenu.addItem(drinkItem7);
        dineInMenu.addItem(drinkItem8);
        dineInMenu.addItem(drinkItem9);
        dineInMenu.addItem(drinkItem10);

        // Display welcome message
        System.out.println("Welcome to the Restaurant Menu Management System (RMMS)");
        System.out.println("Developed by [Your Name] and [Your Team Members]");

        // Ask user if they want to place an order
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to place an order? (yes/no): ");
        String placeOrder = scanner.nextLine();

        if (placeOrder.equalsIgnoreCase("yes")) {
            // Get customer details
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your status (New, Active, VIP): ");
            String status = scanner.nextLine();
            Customer customer = new Customer(name, status);

            // Display menus
            System.out.println("1. Take-Away Menu");
            System.out.println("2. Dine-In Menu");
            System.out.print("Select a menu (1 or 2): ");
            int menuChoice = scanner.nextInt();

            Menu selectedMenu = menuChoice == 1 ? takeAwayMenu : dineInMenu;
            System.out.println(selectedMenu.toString());

            // Create order
            double total = 0.0;

            // Add items to order
            while (true) {
                System.out.print("Enter item number to add to your order (or 0 to finish): ");
                int itemNumber = scanner.nextInt();
                if (itemNumber == 0)
                    break;

                MenuItem selectedItem = selectedMenu.getItem(itemNumber);
                if (selectedItem != null) {
                    total += selectedItem.calculatePrice();
                } else {
                    System.out.println("Invalid item number. Try again.");
                }
            }

            // Calculate total and generate invoice
            total *= (1 - customer.getDiscount());
            if (menuChoice == 2) {
                total += total * 0.025; // Add 2.5% service charge for dine-in orders
            }
            System.out.println("Total Amount Due: $" + String.format("%.2f", total));
            System.out.println("Customer: " + customer);
        } else {
            System.out.println("Thank you! Have a nice day.");
        }
    }
}
