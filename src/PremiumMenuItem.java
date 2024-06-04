
public class PremiumMenuItem extends MenuItem {
    private double surchargePercentage;

    public PremiumMenuItem() {
        super();
        this.surchargePercentage = 0.0;
    }

    public PremiumMenuItem(int itemNumber, String itemName, String description, double itemPrice,
            String additionalAttribute, double surchargePercentage) {
        super(itemNumber, itemName, description, itemPrice, additionalAttribute);
        this.surchargePercentage = surchargePercentage;
    }

    @Override
    public double calculatePrice() {
        return getItemPrice() * (1 + surchargePercentage / 100);
    }

    // Getter and setter
    public double getSurchargePercentage() {
        return surchargePercentage;
    }

    public void setSurchargePercentage(double surchargePercentage) {
        this.surchargePercentage = surchargePercentage;
    }
}
