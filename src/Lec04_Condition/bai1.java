/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec04_Condition;

/**
 *
 * @author vomin
 */
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if(n > 0) {
            System.out.println("so duong");
        }else if(n < 0) {
            System.out.println("so am");
        }else{
            System.out.println("bang 0");
        }
    }
}
