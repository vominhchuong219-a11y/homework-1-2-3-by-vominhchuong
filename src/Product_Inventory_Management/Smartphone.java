package Product_Inventory_Management;

import java.util.Scanner;

public class Smartphone extends Product {

    private int storageGB;
    private double taxPercent;

    public Smartphone() {
        super();
    }

    public Smartphone(String id, double basePrice, java.util.Date importDate, boolean isAvailable, int quantity, int storageGB, double taxPercent) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.storageGB = storageGB;
        this.taxPercent = taxPercent;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    @Override
    public void addProduct() {
        super.addProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter storage (GB): ");
        this.storageGB = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter tax percentage: ");
        this.taxPercent = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void updateProduct() {
        super.updateProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new storage (GB): ");
        this.storageGB = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new tax percentage: ");
        this.taxPercent = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void displayDetails() {
        System.out.print("Smartphone [");
        super.displayDetails();
        System.out.println(", Storage: " + storageGB + "GB, Tax: " + taxPercent + "%, Selling Price: " + calculatePrice() + "]");
    }

    @Override
    public double calculatePrice() {
        double storageFee;
        if (storageGB >= 512) {
            storageFee = getBasePrice() * 0.15;
        } else if (storageGB >= 256) {
            storageFee = getBasePrice() * 0.10;
        } else {
            storageFee = getBasePrice() * 0.05;
        }
        double sellingPrice = (getBasePrice() + storageFee) * (1 + taxPercent / 100);
        return sellingPrice;
    }
}
