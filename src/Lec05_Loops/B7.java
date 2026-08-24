/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec05_Loops;

/**
 *
 * @author vomin
 */
import java.util.*;

public class B7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double Total = 0;
        int Amount = -1;
        double Median = Total/Amount;
        do {
            Total += n;
            Amount++;
        } while (n != 0);
        if (Amount == 0) {
            System.out.println("No data");
        } else {
            System.out.println("Total = " + Total);
            System.out.println("Amount = " + Amount);
            System.out.println("Median = " + Median);
        }
    }
}
