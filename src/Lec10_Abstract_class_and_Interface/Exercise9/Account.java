/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Abstract_class_and_Interface.Exercise9;

/**
 *
 * @author vomin
 */
public abstract class Account {

    private double balance = 0;

    public Account() {

    }

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract String getAccountType();

    public void display() {
        System.out.println("AccountType: " + getAccountType());
        System.out.println("Balance: " + this.balance);
    }

}
