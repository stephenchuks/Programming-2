package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

/*
 * Represents a customer with a shopping cart.
 * Allows adding/removing products and viewing the cart.
 */
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

    // Public getter for the shopping cart
    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    // Add product to the cart
    public void addToCart(Product product) {
        shoppingCart.add(product);
        System.out.println(product.getName() + " has been added to your cart.");
    }

    // Display the contents of the shopping cart
    public void displayCart() {
        if (shoppingCart.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Your Shopping Cart:");
            double total = 0;
            for (Product product : shoppingCart) {
                System.out.printf("Name: %s, Price: $%.2f%n", product.getName(), product.getPrice());
                total += product.getPrice();
            }
            System.out.printf("Total: $%.2f%n", total);
        }
    }
}
