package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

/*
 * Represents a product available for purchase.
 * Includes attributes such as ID, name, and price.
 * Provides static methods to simulate browsing products.
 */
public class Product {
    private int productID;
    private String name;
    private double price;

    // Static list to simulate available products
    private static List<Product> productList = new ArrayList<>();

    static {
        // Adding some products to the list
        productList.add(new Product(1, "Laptop", 999.99));
        productList.add(new Product(2, "Smartphone", 699.99));
        productList.add(new Product(3, "Headphones", 199.99));
        productList.add(new Product(4, "Smartwatch", 249.99));
        productList.add(new Product(5, "Tablet", 499.99));
    }

    // Constructor
    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Static method to display available products
    public static void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : productList) {
            System.out.printf("ID: %d, Name: %s, Price: $%.2f%n",
                    product.getProductID(), product.getName(), product.getPrice());
        }
    }

    // Static method to fetch a product by ID
    public static Product getProductByID(int id) {
        for (Product product : productList) {
            if (product.getProductID() == id) {
                return product;
            }
        }
        return null; // Return null if product not found
    }
}
