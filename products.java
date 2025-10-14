public class products {
    // Attributes
    private String id;
    private String name;
    private double price;
    private double discount; // in percentage (e.g. 10 means 10%)

    // Constructor
    public products(String id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    // Method to calculate price after discount
    public double priceAfterDiscount() {
        return price - (price * discount / 100);
    }

    // Method to calculate final price with 5% VAT
    public double finalPrice() {
        double afterDiscount = priceAfterDiscount();
        return afterDiscount + (afterDiscount * 5 / 100);
    }

    // Main method
    public static void main(String[] args) {
        // Create two Product objects
        products laptop = new products("P001", "Laptop", 500.0, 10);
        products phone = new products("P002", "Phone", 300.0, 5);

        // Print detailed calculations

        System.out.println("Detailed Calculation:");
        System.out.println(laptop.getName() + " original: " + laptop.getPrice() +
                ", after discount: " + laptop.priceAfterDiscount() +
                ", final with VAT: " + laptop.finalPrice());
        System.out.println(phone.getName() + " original: " + phone.getPrice() +
                ", after discount: " + phone.priceAfterDiscount() +
                ", final with VAT: " + phone.finalPrice());
    }
}