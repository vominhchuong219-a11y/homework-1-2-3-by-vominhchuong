/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.Access_Modifier.New;


/**
 *
 * @author vomin
 */
public class B {
    public static int publicB = 1;
    protected static int protectedB = 2;
    static int defaultB = 3;
    private static int privateB = 4;
    
    public static void printVariable(){
        System.out.println(publicB);
        System.out.println(protectedB);
        System.out.println(defaultB);
        System.out.println(privateB);
    }
    public static void main(String[] args) {
        B.printVariable();
    }
}
