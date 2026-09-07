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
public class Exercise_1_Basic_String_Information {
    public static String trimText(String s) {
        return s.trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String s = sc.nextLine();
        String trimmed = trimText(s);
        System.out.println("Original: [" + s + "]");
        System.out.println("Trimmed: [" + s.trim() + "]");
        System.out.println("Upper: [" + s.toUpperCase() + "]");
        System.out.println("Lower: [" + s.toLowerCase() + "]");
        System.out.println("Original length = " + s.length());
        System.out.println("length after trim: " + trimmed.length());
    }
}
