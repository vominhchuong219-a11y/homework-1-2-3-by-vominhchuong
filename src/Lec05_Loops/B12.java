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

public class B12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int wrongCount = 0;
        int totalScore = 0;

        while (wrongCount < 3) {
            int termCount = random.nextInt(4) + 2;
            int correctSum = 0;
            StringBuilder expression = new StringBuilder();

            for (int i = 0; i < termCount; i++) {
                int term = random.nextInt(10) + 1;
                correctSum += term;

                expression.append(term);
                if (i < termCount - 1) {
                    expression.append(" + ");
                }
            }

            System.out.print(expression.toString() + " = ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctSum) {
                System.out.println("+1 diem.");
                totalScore++;
            } else {
                wrongCount++;
                System.out.println("Ga. Sai " + wrongCount + "/3");
            }
        }
        System.out.println("Tong diem : " + totalScore);
    }
}
