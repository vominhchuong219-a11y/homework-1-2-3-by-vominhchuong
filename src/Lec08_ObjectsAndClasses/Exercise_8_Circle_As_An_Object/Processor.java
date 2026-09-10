/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjectsAndClasses.Exercise_8_Circle_As_An_Object;

/**
 *
 * @author vomin
 */
import java.util.*;
public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        Circle_Shape circle = new Circle_Shape(radius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

    }
}
