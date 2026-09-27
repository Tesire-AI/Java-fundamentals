package java_objects;

import java.util.Scanner;

public class ShoppingCart {
    private int totalItems;
    private double totalPrice;

    public void addItem(double price) {
        totalItems++;
        totalPrice += price;
        getCartSummary();
    }

    public void removeItem(double price) {
        if (totalItems > 0) {
            totalItems--;
            totalPrice -= price;
        }
        getCartSummary();
    }

    public void emptyCart() {
        totalItems = 0;
        totalPrice = 0.0;
        getCartSummary();
    }

    private void getCartSummary() {
        System.out.println("Cart has " + totalItems + " items. Total: $" + totalPrice);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item name:");
        String itemName = sc.nextLine();

        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();

        System.out.println("Enter price per item:");
        double price = sc.nextDouble();

        for (int i = 0; i < quantity; i++) {
            cart.addItem(price);
        }

        cart.removeItem(price);

        System.out.println("Final cart status:");
        cart.getCartSummary();

        sc.close();
    }
}
