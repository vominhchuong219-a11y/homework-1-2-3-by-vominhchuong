package Course_Enrollment_Management;

import java.util.*;

public abstract class OfflineCourse extends Course {

    private String classroomNumber;
    private double materialFeePerStudent;

    public OfflineCourse() {
    }

    public OfflineCourse(String classroomNumber, double materialFeePerStudent) {
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addCourse() {
        System.out.print("Enter ClassroomNumber: ");
        setClassroomNumber(scanner.nextLine());
        System.out.print("Enter MaterialFeePerStudent: ");
        setMaterialFeePerStudent(scanner.nextDouble());
    }

    @Override
    public void updateCourse() {
        System.out.print("Enter ClassroomNumber: ");
        setClassroomNumber(scanner.nextLine());
        System.out.print("Enter MaterialFeePerStudent: ");
        setMaterialFeePerStudent(scanner.nextDouble());
    }

    @Override

    public void displayDetails() {
        System.out.println("ClassroomNumber: " + getClassroomNumber());
        System.out.println("MaterialFeePerStudent: " + getMaterialFeePerStudent());
    }

    @Override
    public double calculateTotalFee() {
        return getFeePerStudent() + getMaterialFeePerStudent() * getEnrolledStudents();
    }
}
