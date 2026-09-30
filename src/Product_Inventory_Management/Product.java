package Product_Inventory_Management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Product implements IProduct {

    private String id;
    private double basePrice;
    private Date importDate;
    private boolean isAvailable;
    private int quantity;

    public Product() {
    }

    public Product(String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        this.id = id;
        this.basePrice = basePrice;
        this.importDate = importDate;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = scanner.nextLine();
        System.out.print("Enter base price: ");
        this.basePrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter import date (dd/MM/yyyy): ");
        String dateStr = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.importDate = sdf.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format! Defaulting to current date.");
            this.importDate = new Date();
        }
        System.out.print("Is available (true/false): ");
        this.isAvailable = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Enter quantity: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new base price: ");
        this.basePrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter new import date (dd/MM/yyyy): ");
        String dateStr = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.importDate = sdf.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format! Keeping old date.");
        }
        System.out.print("Is available (true/false): ");
        this.isAvailable = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Enter new quantity: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = (importDate != null) ? sdf.format(importDate) : "N/A";
        System.out.print("ID: " + id + ", Base Price: " + basePrice + ", Import Date: " + dateStr
                + ", Available: " + isAvailable + ", Quantity: " + quantity);
    }
}
