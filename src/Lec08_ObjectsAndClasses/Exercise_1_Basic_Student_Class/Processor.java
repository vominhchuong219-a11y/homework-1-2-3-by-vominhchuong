/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjectsAndClasses.Exercise_1_Basic_Student_Class;

/**
 *
 * @author vomin
 */
public class Processor {

    public static void main(String[] args) {
        Student_Infor s1 = new Student_Infor("S001", "Vo Minh Chuong", "IT");
        Student_Infor s2 = new Student_Infor("S002", "Vo Phi Tay", "Gamer");
        s1.displayInfo();
        s2.displayInfo();
    }
}
