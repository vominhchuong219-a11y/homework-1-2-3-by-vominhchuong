package Lec11_Encapsulation.Exercise_18_Student_with_a_Grade_List;
import java.util.*;
public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.addInfo();
        System.out.println("Nhap diem (-1 = break)");
        while (true) {
            System.out.print("Nhap diem: ");
            double inputGrade = scanner.nextDouble();
            if (inputGrade < 0) {
                break; 
            }
            student.addGrade(inputGrade);
        }
        student.display();
    }
}
