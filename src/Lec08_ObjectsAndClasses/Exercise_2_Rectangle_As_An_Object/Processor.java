package Lec08_ObjectsAndClasses.Exercise_2_Rectangle_As_An_Object;
import java.util.*;
public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        
        Rectangle rect = new Rectangle(length, width);
        
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
        
     
    }
}