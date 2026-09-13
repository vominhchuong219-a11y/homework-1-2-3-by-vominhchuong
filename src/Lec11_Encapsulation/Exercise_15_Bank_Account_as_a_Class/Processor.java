package Lec11_Encapsulation.Exercise_15_Bank_Account_as_a_Class;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        Bank_Account myAccount = new Bank_Account();
        myAccount.addInfo();
        myAccount.display();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nap: ");
        int depositAmount = scanner.nextInt();
        myAccount.deposit(depositAmount);
        myAccount.display();

        System.out.print("Rut: ");
        int withdrawAmount = scanner.nextInt();
        myAccount.withdraw(withdrawAmount);
        myAccount.display();
    }
}
