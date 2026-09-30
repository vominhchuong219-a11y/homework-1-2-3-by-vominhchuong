package Product_Inventory_Management;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductArrayList productList = new ProductArrayList();
        int choice = 0;

        do {
            System.out.println("\n===== PRODUCT INVENTORY MANAGEMENT =====");
            System.out.println("1. Add a Laptop or Smartphone");
            System.out.println("2. Update product by ID");
            System.out.println("3. Delete product by ID");
            System.out.println("4. Display all products");
            System.out.println("5. Display available products");
            System.out.println("6. Find highest selling price among all products");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Please enter a number from 1 to 7.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Choose product type to add:");
                    System.out.println("1. Laptop");
                    System.out.println("2. Smartphone");
                    System.out.print("Choice: ");
                    int type = 0;
                    try {
                        type = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid choice!");
                        break;
                    }
                    Product product = null;
                    if (type == 1) {
                        product = new Laptop();
                        product.addProduct();
                        productList.addProductToArrayList(product);
                    } else if (type == 2) {
                        product = new Smartphone();
                        product.addProduct();
                        productList.addProductToArrayList(product);
                    } else {
                        System.out.println("Invalid product type!");
                    }
                    break;
                case 2:
                    System.out.print("Enter product ID to update: ");
                    String updateId = scanner.nextLine();
                    productList.updateProductById(updateId);
                    break;
                case 3:
                    System.out.print("Enter product ID to delete: ");
                    String deleteId = scanner.nextLine();
                    productList.deleteProductById(deleteId);
                    break;
                case 4:
                    System.out.println("\n--- ALL PRODUCTS LIST ---");
                    productList.displayAllProducts();
                    break;
                case 5:
                    System.out.println("\n--- AVAILABLE PRODUCTS LIST ---");
                    productList.displayAvailableProducts();
                    break;
                case 6:
                    double highestPrice = productList.findHighestPrice();
                    System.out.println("The highest selling price in the system: " + highestPrice);
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose from 1 to 7.");
            }
        } while (choice != 7);
        scanner.close();
    }
}
