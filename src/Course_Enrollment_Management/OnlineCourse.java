package Course_Enrollment_Management;

import java.util.*;

public abstract class OnlineCourse extends Course {

    private String platformName;
    private double discountPercent;

    public OnlineCourse() {
    }

    public OnlineCourse(String platformName, double discountPercent) {
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public String getPlatformName() {
        return platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addCourse() {
        System.out.print("Enter platformName: ");
        setPlatformName(scanner.nextLine());
        System.out.print("Enter discountPercent: ");
        setDiscountPercent(scanner.nextDouble());
    }

    @Override
    public void updateCourse() {
        System.out.print("Enter platformName: ");
        setPlatformName(scanner.nextLine());
        System.out.print("Enter discountPercent: ");
        setDiscountPercent(scanner.nextDouble());
    }

    @Override

    public void displayDetails() {
        System.out.println("platformName: " + getPlatformName());
        System.out.println("discountPercent: " + getDiscountPercent());
    }

    @Override
    public double calculateTotalFee() {
        return getFeePerStudent()*getEnrolledStudents()*(1-getDiscountPercent()/100);
    }
}
