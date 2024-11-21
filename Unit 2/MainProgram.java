import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;

import java.util.Scanner;

/*
 * Simulates a simple e-commerce system through a console-based interface.
 */
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a customer
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(101, customerName);

        // Simulate browsing and adding products
        boolean keepShopping = true;
        while (keepShopping) {
            Product.displayProducts();
            System.out.print("Enter the Product ID to add to cart (or 0 to finish): ");
            int productID = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (productID == 0) {
                keepShopping = false;
            } else {
                Product product = Product.getProductByID(productID);
                if (product != null) {
                    customer.addToCart(product);
                } else {
                    System.out.println("Invalid Product ID. Please try again.");
                }
            }
        }

        // Display the cart
        customer.displayCart();

        // Place an order
        System.out.println("Placing your order...");
        Order order = new Order(1001, customer);
        order.displayOrderSummary();

        scanner.close();
    }
}
