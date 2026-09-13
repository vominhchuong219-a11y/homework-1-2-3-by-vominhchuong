package Lec11_Encapsulation.GetSet;
import java.util.*;

public class Student {

    private String studentID;
    private float GPA;

    public static String University = "VN-US";
    public static int count = 0;

    public Student() {
        count = count + 1;
    }

    public Student(String studentID, float GPA) {
        this.studentID = studentID;
        this.GPA = GPA;
        count++;
    }

    public String getStudentID() {
        return studentID;
    }

    public float getGPA() {
        return GPA;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public void displayInfo() {
        System.out.println("StudentID: " + getStudentID() + "GPA: " + getGPA() + "Count: " + count);
    }

    public void enterInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter studentID: ");
        String studentID = sc.nextLine();
        setStudentID(studentID);
        System.out.print("Enter GPA: ");
        setGPA(sc.nextFloat());
    }

    public static void Hello() {
        System.out.println("Hello ");
    }
}
