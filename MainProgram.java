/*
 * This program demonstrates a simple e-commerce system for an online store.
 * The system allows customers to browse products, add them to a shopping cart, 
 * and place orders. The code is organized into two packages: 
 * 
 * - com.ecommerce: Contains the Customer and Product classes.
 * - com.ecommerce.orders: Contains the Order class.
 * 
 * The main program showcases the functionality by creating products, 
 * adding them to a customer's cart, and placing an order. 
 * It emphasizes proper code organization using Java packages and the import statement.
 */


import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;

public class MainProgram {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product(1, "Laptop", 1200.00);
        Product product2 = new Product(2, "Smartphone", 800.00);
        Product product3 = new Product(3, "Headphones", 150.00);

        // Create customer
        Customer customer = new Customer(101, "Alice");

        // Simulate customer shopping
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);

        // Display cart details
        customer.displayCart();

        // Place an order
        Order order = new Order(2, customer);

        // Display order summary
        System.out.println("\nOrder Summary:");
        order.displayOrderSummary();
    }
}
