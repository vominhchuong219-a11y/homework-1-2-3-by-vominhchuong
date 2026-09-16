/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Abstract_class_and_Interface.Exercise2;

/**
 *
 * @author vomin
 */
public abstract class Employee {
    private String name;
    public Employee(String name){
        this.name = name;
    }
    public Employee(){
        
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void displayInfo(){
        System.out.println("Name: " + getName());
    }
    abstract double calculateSalary();
}
