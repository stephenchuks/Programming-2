package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private List<Product> shoppingCart;

    // Constructor
    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    // Getters
    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    // Add a product to the shopping cart
    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    // Remove a product from the shopping cart
    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    // Calculate the total cost of products in the cart
    public double calculateTotalCost() {
        double total = 0.0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }

    // Display the contents of the shopping cart
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product product : shoppingCart) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
        System.out.println("Total: $" + calculateTotalCost());
    }
}
