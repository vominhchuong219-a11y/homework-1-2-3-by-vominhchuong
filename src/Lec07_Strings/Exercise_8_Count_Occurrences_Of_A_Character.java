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
public class Exercise_8_Count_Occurrences_Of_A_Character {

    public static int CountOccurrences(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Enter character to count: ");
        char target = sc.next().charAt(0);
        System.out.println("Occurrences of '" + target + "':" + CountOccurrences(text, target));
    }
}
