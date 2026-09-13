/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.Access_Modifier.New;

import Lec11_Encapsulation.Access_Modifier.Old.A;

public class A1 extends A{
    public static void printValue() {
        System.out.println(A.publicA);
        System.out.println(A.protectedA);
        System.out.println(B.publicB);
        System.out.println(B.protectedB);
        System.out.println(B.defaultB);
    }
    public static void main(String[] args) {
        A1.printValue();
    }
}
