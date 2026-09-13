package Lec11_Encapsulation.Exercise_15_Bank_Account_as_a_Class;

import java.util.*;

public class Bank_Account {

    private String accountNumber;
    private String owner;
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Nap " + amount + " thanh cong");
        } else {
            System.out.println("Ngheo vay troi");
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Rut " + amount + " thanh cong");
            return true;
        } else {
            System.out.println("Ngheo vay troi");
            return false;
        }
    }

    public void display() {
        System.out.println("AccountNumber: " + this.accountNumber);
        System.out.println("Owner: " + this.owner);
        System.out.println("Balance: " + this.balance);
    }

    public void addInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Account Number: ");
        this.accountNumber = scanner.nextLine();
        System.out.print("Owner: ");
        this.owner = scanner.nextLine();
        System.out.print("Balance: ");
        this.balance = scanner.nextInt();
    }

}
