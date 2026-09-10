/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjectsAndClasses.Exercise_6_Basic_Book_Class;

/**
 *
 * @author vomin
 */
public class Book {
    private String title;
    private String author;
    private String price;
    public Book (String title, String author, String price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBook (){
        System.out.println(title + " | " + author + " | " + price);
    }
}
