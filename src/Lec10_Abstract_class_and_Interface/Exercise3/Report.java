/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Abstract_class_and_Interface.Exercise3;

/**
 *
 * @author vomin
 */
public class Report implements Printable {

    private String title;

    public Report(String t) {
        this.title = t;
    }

    @Override
    public void print() {
        System.out.println("Tieu de: " + this.title);
    }
}
