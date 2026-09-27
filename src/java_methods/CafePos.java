 package java_methods;
 
 public class CafePos {
    public static void main(String[] args) {
        String customerName = "Alex";
        double coffeePrice = 4.50;
        int quantity = 4;
        boolean hasLoyaltyCard = true;

        double baseTotal = coffeePrice * quantity;
        double taxRate = 0.08;

        double discountedTotal = baseTotal;

        if (hasLoyaltyCard) {
            discountedTotal -= 2.50;
        } else if (baseTotal > 15.00) {
            discountedTotal -= baseTotal * 0.10; 
        }

        double finalTotal = calculateTax(discountedTotal, taxRate);

        generateReceipt(customerName, finalTotal);
    }

    public static double calculateTax(double amount, double taxRate) {
        return amount + (amount * taxRate);
    }

    public static void generateReceipt(String name, double finalAmount) {
        System.out.println("*** Cafe Receipt ***");
        System.out.println("Customer: " + name);
        System.out.println("Total Due: $" + finalAmount);
    }
}
