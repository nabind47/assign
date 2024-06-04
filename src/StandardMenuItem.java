
public class StandardMenuItem extends MenuItem {
    public StandardMenuItem() {
        super();
    }

    public StandardMenuItem(int itemNumber, String itemName, String description, double itemPrice,
            String additionalAttribute) {
        super(itemNumber, itemName, description, itemPrice, additionalAttribute);
    }

    @Override
    public double calculatePrice() {
        return getItemPrice();
    }
}
