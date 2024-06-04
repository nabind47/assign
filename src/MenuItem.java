public abstract class MenuItem {
    private int itemNumber;
    private String itemName;
    private String description;
    private double itemPrice;
    private String additionalAttribute;

    public MenuItem() {
        this.itemNumber = 0;
        this.itemName = "unknown";
        this.description = "unknown";
        this.itemPrice = 0.0;
        this.additionalAttribute = "unknown";
    }

    public MenuItem(int itemNumber, String itemName, String description, double itemPrice, String additionalAttribute) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.description = description;
        this.itemPrice = itemPrice;
        this.additionalAttribute = additionalAttribute;
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "Item Number: " + itemNumber + ", Name: " + itemName + ", Description: " + description +
                ", Price: " + itemPrice + ", Additional: " + additionalAttribute;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getAdditionalAttribute() {
        return additionalAttribute;
    }

    public void setAdditionalAttribute(String additionalAttribute) {
        this.additionalAttribute = additionalAttribute;
    }
}
