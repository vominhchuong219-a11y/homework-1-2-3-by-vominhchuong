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
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println(n + " la so chan");
        }else{
            System.out.println(n + " la so le");
        }
    }
}
