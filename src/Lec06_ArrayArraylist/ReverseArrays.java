/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_ArrayArraylist;

/**
 *
 * @author vomin
 */
import java.util.*;

public class ReverseArrays {

    public static void reverseTwoPointers(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] reverseAuxiliaryArray(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }
        return reversed;
    }

    public static void reverseRecursion(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseRecursion(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu n: ");
        int n = scanner.nextInt();
        int[] originalArray = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            originalArray[i] = scanner.nextInt();
        }

        System.out.println("\n--- MANG BAN DAU ---");
        System.out.println(java.util.Arrays.toString(originalArray));

        int[] arr1 = originalArray.clone();
        reverseTwoPointers(arr1);
        System.out.println("\n[Cach 1 - Two Pointers]: " + java.util.Arrays.toString(arr1));

        int[] arr2 = reverseAuxiliaryArray(originalArray);
        System.out.println("[Cach 2 - Mang phu]:    " + java.util.Arrays.toString(arr2));

        int[] arr3 = originalArray.clone();
        reverseRecursion(arr3, 0, arr3.length - 1);
        System.out.println("[Cach 3 - De quy]:       " + java.util.Arrays.toString(arr3));

    }
}
