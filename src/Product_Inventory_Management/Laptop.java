package Product_Inventory_Management;

import java.util.Scanner;

public class Laptop extends Product {

    private int warrantyYears;
    private double discountPercent;

    public Laptop() {
        super();
    }

    public Laptop(String id, double basePrice, java.util.Date importDate, boolean isAvailable, int quantity, int warrantyYears, double discountPercent) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.warrantyYears = warrantyYears;
        this.discountPercent = discountPercent;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addProduct() {
        super.addProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter warranty years: ");
        this.warrantyYears = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter discount percentage: ");
        this.discountPercent = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void updateProduct() {
        super.updateProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new warranty years: ");
        this.warrantyYears = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new discount percentage: ");
        this.discountPercent = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void displayDetails() {
        System.out.print("Laptop [");
        super.displayDetails();
        System.out.println(", Warranty Years: " + warrantyYears + ", Discount: " + discountPercent + "%, Selling Price: " + calculatePrice() + "]");
    }

    @Override
    public double calculatePrice() {
        double warrantyFee;
        if (warrantyYears >= 3) {
            warrantyFee = getBasePrice() * 0.08;
        } else {
            warrantyFee = getBasePrice() * 0.03;
        }
        double sellingPrice = (getBasePrice() + warrantyFee) * (1 - discountPercent / 100);
        return sellingPrice;
    }
}
