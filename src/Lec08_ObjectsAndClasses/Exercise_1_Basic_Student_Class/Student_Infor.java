/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjectsAndClasses.Exercise_1_Basic_Student_Class;

/**
 *
 * @author vomin
 */

public class Student_Infor {
    private String studentID;
    private String fullname;
    private String major;
    public Student_Infor (String studentID, String fullname, String major){
        this.studentID = studentID;
        this.fullname = fullname;
        this.major = major;
    }
    public void displayInfo() {
        System.out.println(studentID + " - " + fullname + " - " + major);
    }
}