public class Customer {
    private String name;
    private String status;
    private double discount;

    // Default constructor
    public Customer() {
        this.name = "unknown";
        this.status = "New";
        setDiscount();
    }

    // Constructor with parameters
    public Customer(String name, String status) {
        this.name = name;
        this.status = status;
        setDiscount();
    }

    private void setDiscount() {
        switch (status) {
            case "Active":
                this.discount = 0.10;
                break;
            case "VIP":
                this.discount = 0.15;
                break;
            default:
                this.discount = 0.0;
                break;
        }
    }

    @Override
    public String toString() {
        return "Customer Name: " + name + ", Status: " + status + ", Discount: " + (discount * 100) + "%";
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        setDiscount();
    }

    public double getDiscount() {
        return discount;
    }
}
