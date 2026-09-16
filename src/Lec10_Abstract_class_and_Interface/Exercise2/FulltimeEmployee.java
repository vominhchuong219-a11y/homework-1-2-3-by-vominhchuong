/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Abstract_class_and_Interface.Exercise2;

/**
 *
 * @author vomin
 */
public class FulltimeEmployee extends Employee {

    private double salary;

    public FulltimeEmployee() {

    }

    public FulltimeEmployee(double salary) {
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    @Override
    public double calculateSalary(){
        return getSalary();
    }
}
