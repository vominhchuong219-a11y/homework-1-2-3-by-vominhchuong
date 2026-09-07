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
public class Exercise_5_Check_Prefix_Suffix_And_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String s = sc.nextLine();
        System.out.println("Starts with report: " + s.startsWith(s));
        System.out.println("Ends with .pdf: " + s.endsWith(s));
        System.out.println("First character = " + s.charAt(0));
        System.out.println("Last character = " + s.charAt(3));
    }
}
