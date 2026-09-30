package Product_Inventory_Management;

import java.util.ArrayList;

public class ProductArrayList {

    ArrayList<Product> products = new ArrayList<>();

    public void addProductToArrayList(Product product) {
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public void updateProductById(String id) {
        Product found = null;
        for (Product p : products) {
            if (p.getId().equalsIgnoreCase(id)) {
                found = p;
                break;
            }
        }
        if (found != null) {
            System.out.println("Product found, proceeding to update:");
            found.updateProduct();
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void deleteProductById(String id) {
        Product found = null;
        for (Product p : products) {
            if (p.getId().equalsIgnoreCase(id)) {
                found = p;
                break;
            }
        }
        if (found != null) {
            products.remove(found);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("The product list is empty.");
            return;
        }
        for (Product p : products) {
            p.displayDetails();
        }
    }

    public void displayAvailableProducts() {
        if (products.isEmpty()) {
            System.out.println("The product list is empty.");
            return;
        }
        boolean hasAvailable = false;
        for (Product p : products) {
            if (p.isAvailable()) {
                p.displayDetails();
                hasAvailable = true;
            }
        }
        if (!hasAvailable) {
            System.out.println("No products are currently available for sale.");
        }
    }

    public double findHighestPrice() {
        if (products.isEmpty()) {
            return 0.0;
        }
        double maxPrice = products.get(0).calculatePrice();
        for (int i = 1; i < products.size(); i++) {
            double price = products.get(i).calculatePrice();
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }
}
