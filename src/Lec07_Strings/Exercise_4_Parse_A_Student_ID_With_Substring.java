/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec07_Strings;

/**
 *
 * @author vomin
 */
import java.util.*;

public class Exercise_4_Parse_A_Student_ID_With_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String s = sc.next();
        System.out.println("Major code: " + s.substring(0, 2));
        System.out.println("Numeric part = " + s.substring(2, 8));
    }
    
}
