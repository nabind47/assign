public class DrinkMenuItem extends MenuItem {
    public DrinkMenuItem() {
        super();
    }

    public DrinkMenuItem(int itemNumber, String itemName, String description, double itemPrice,
            String additionalAttribute) {
        super(itemNumber, itemName, description, itemPrice, additionalAttribute);
    }

    @Override
    public double calculatePrice() {
        return getItemPrice();
    }
}