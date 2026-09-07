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

public class Exercise_10_Censor_A_Word_In_A_Sentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to censor: ");
        String word = sc.nextLine();
        String star = "";
        for (int i = 0; i < word.length(); i++) {
            star += "*";
        }
        String censoredSentence = sentence.replace(word, star);
        System.out.println("Censored: " + censoredSentence);
    }
}
