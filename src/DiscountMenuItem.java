
public class DiscountMenuItem extends MenuItem {
    public DiscountMenuItem() {
        super();
    }

    public DiscountMenuItem(int itemNumber, String itemName, String description, double itemPrice,
            String additionalAttribute) {
        super(itemNumber, itemName, description, itemPrice, additionalAttribute);
    }

    @Override
    public double calculatePrice() {
        return getItemPrice() * 0.95;
    }
}
