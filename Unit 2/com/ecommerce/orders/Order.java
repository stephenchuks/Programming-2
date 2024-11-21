package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;

import java.util.List;

/*
 * Represents an order placed by a customer.
 * Includes a summary and status management.
 */
public class Order {
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double total;

    // Constructor
    public Order(int orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = customer.getShoppingCart(); // Use getter to access the cart
        calculateTotal();
    }

    // Calculate the total order cost
    private void calculateTotal() {
        for (Product product : products) {
            total += product.getPrice();
        }
    }

    // Display the order summary
    public void displayOrderSummary() {
        System.out.println("Order Summary:");
        System.out.printf("Order ID: %d%nCustomer: %s%n", orderID, customer.getName());
        for (Product product : products) {
            System.out.printf("Product: %s, Price: $%.2f%n", product.getName(), product.getPrice());
        }
        System.out.printf("Total: $%.2f%n", total);
    }
}
