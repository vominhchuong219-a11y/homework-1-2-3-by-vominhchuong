package Course_Enrollment_Management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Course implements ICourse {

    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrolledStudents;

    public Course() {
    }

    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }

    public String getId() {
        return id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void addCourse() {
        System.out.print("Enter id: ");
        setId(scanner.nextLine());

        System.out.print("Enter feePerStudent: ");
        setFeePerStudent(scanner.nextDouble());

        System.out.print("Enter startDate: ");
        try {
            setStartDate(sdf.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Wrong Format");
        }

        System.out.print("Enter isAvailable (1:Yes/2:No): ");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("True");
            setIsAvailable(true);
        } else {
            System.out.println("False");
        }

        System.out.print("Enter enrolledStudents: ");
        setEnrolledStudents(scanner.nextInt());
    }

    @Override
    public void updateCourse() {
        System.out.print("Enter id: ");
        setId(scanner.nextLine());

        System.out.print("Enter feePerStudent: ");
        setFeePerStudent(scanner.nextDouble());

        System.out.print("Enter startDate: ");
        try {
            setStartDate(sdf.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Wrong Format");
        }

        System.out.print("Enter isAvailable (1:Yes/2:No): ");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("True");
            setIsAvailable(true);
        } else {
            System.out.println("False");
        }

        System.out.print("Enter enrolledStudents: ");
        setEnrolledStudents(scanner.nextInt());
    }

    @Override
    public void displayDetails() {
        System.out.println("id: " + getId());
        System.out.println("feePerStudent: " + getFeePerStudent());
        System.out.println("startDate: " + (getStartDate()) != null ? sdf.format(getStartDate()) : "null");
        System.out.println("isAvailable: " + isIsAvailable());
        System.out.println("enrolledStudents: " + getEnrolledStudents());
    }

    void add(ArrayList<Course> courses) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
