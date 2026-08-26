/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_ArrayArraylist;

/**
 *
 * @author vomin
 */
import java.util.Scanner;

public class ArraySumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.print("Enter n: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
        }
        System.out.print("Sum = " + sum);
        System.out.println(" Average = " + average);

    }
}
