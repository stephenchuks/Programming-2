package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;
import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double orderTotal;

    // Constructor
    public Order(int orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = customer.getShoppingCart();
        this.orderTotal = calculateOrderTotal();
    }

    // Calculate the total cost of the order
    private double calculateOrderTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Display the order summary
    public void displayOrderSummary() {
        System.out.println("Order Summary:");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
        System.out.println("Total: $" + orderTotal);
    }
}
