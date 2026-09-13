/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.Exercise_11_Car_Profile_Class;

/**
 *
 * @author vomin
 */
import java.util.*;

public class Car_Profile {

    private String make;
    private String model;
    private int year;

    public Car_Profile(){
        
    }
    public Car_Profile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void addProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Make: ");
        this.make = sc.nextLine();
        System.out.print("Model: ");
        this.model = sc.nextLine();
        System.out.print("Year: ");
        this.year = sc.nextInt();
    }

    public void displayProfile() {
        System.out.print("Make: " + make + "Model: " + model + "Year: " + year);
    }
}
