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
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem tong: ");
        double diem = sc.nextDouble();
        if(diem >= 5.0){
            System.out.println("Dat");
        }else{
            System.out.println("Khong dat");
        }
    }
}
