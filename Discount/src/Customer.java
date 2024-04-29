public class Customer {
    private String name;
    private Discount type; // "Student", "Senior Citizen", or "Regular"

    public Customer(String name, Discount type) {
        this.name = name;
        this.type = type;
    }

    public double registerDiscount(double amount) {
        return amount - type.calculate(amount);
    }
}


