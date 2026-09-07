/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec07_Strings;

import java.util.Scanner;

/**
 *
 * @author vomin
 */

public class Exercise_7_Reverse_A_String_With_StringBuilder {
    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String original = sc.nextLine();
        System.out.println("original: " + original);
        System.out.println("Reversed: " + reverse(original));;
        
    }
}
