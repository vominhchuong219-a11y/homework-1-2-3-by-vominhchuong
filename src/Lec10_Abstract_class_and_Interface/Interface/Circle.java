/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Abstract_class_and_Interface.Interface;

/**
 *
 * @author vomin
 */
public class Circle implements IColor {
    @Override
    public void fillColor(){
        System.out.println("Filling the circle with green");
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }
}
