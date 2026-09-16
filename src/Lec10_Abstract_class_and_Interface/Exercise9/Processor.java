/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Abstract_class_and_Interface.Exercise9;

/**
 *
 * @author vomin
 */
import java.util.*;
public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Balance: ");
        double initialBalance = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(initialBalance);
        savingsAccount.display();
    }
}
