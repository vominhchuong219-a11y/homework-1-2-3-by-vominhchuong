package Lec11_Encapsulation.Exercise_18_Student_with_a_Grade_List;

import java.util.*;

public class Student {

    private String id;
    private String name;
    private ArrayList<Double> grades;

    public Student() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 10) { // Giả sử thang điểm 10
            this.grades.add(grade);
        } else {
            System.out.println("Error");
        }
    }

    public double getAverage() {
        if (this.grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double g : this.grades) {
            sum += g;
        }
        return sum / this.grades.size();
    }

    public void display() {
        System.out.println("Ma : " + this.id);
        System.out.println("Ho ten: " + this.name);
        System.out.println("Ds diem: " + this.grades);
        System.out.printf("Diem tb: %.2f\n", this.getAverage());
    }

    public void addInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma: ");
        this.id = scanner.nextLine();

        System.out.print("Ho ten: ");
        this.name = scanner.nextLine();
    }
}
