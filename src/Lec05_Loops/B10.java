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

public class B10 {

    public static void main(String[] args) {
        Random rd = new Random();
        int RandomNumber1to20 = rd.nextInt(21) + 1;
        Scanner sc = new Scanner(System.in);      
        int count = 0;
        int n;
        do {
            n = sc.nextInt();
            if (n > RandomNumber1to20) {
                System.out.println("Can doan nho hon");
            } else if (n < RandomNumber1to20) {
                System.out.println("Can doan lon hon");
            } else {
                System.out.println("Chungmungthanglon");
            }
            count++;
        } while (RandomNumber1to20 != n);
        System.out.println("So lan doan: " + count);
    }
}
