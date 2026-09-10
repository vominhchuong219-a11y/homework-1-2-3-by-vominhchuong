/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjectsAndClasses.Exercise_6_Basic_Book_Class;

/**
 *
 * @author vomin
 */
public class Processor {

    public static void main(String[] args) {
        Book b1 = new Book("Clean code", "Noname", "3000$");
        Book b2 = new Book("Lam di", "Noname", "1000000000$");
        b1.displayBook();
        b2.displayBook();
    }

}
