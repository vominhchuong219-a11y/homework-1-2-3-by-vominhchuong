/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec07_Strings;

/**
 *
 * @author vomin
 */
import java.util.*;
public class Exercise_3_String_Concatenation_And_Immutability {
    public static String ConcatenateWithPlus(String first, String second) {
        return first + " " + second;
    }
    public static String ConcatenateWithConcat(String first, String second) {
        return first.concat(" ").concat(second);
    }
    public static void main(String[] args) {
        String first = "Duy Tan";
        String second = "University";
        System.out.println("Using +: " + ConcatenateWithPlus(first, second));
        System.out.println("Using concat: " + ConcatenateWithConcat(first, second));
        first.concat(" University");
        System.out.println("first after concat without reassignment: " + first);
    }
}
