package Lec11_Encapsulation.GetSet;
public class Processor {

    public static void main(String[] args) {
        Student stu1 = new Student("s1", 3);
        Student stu2 = new Student("s2", 4);
        Student stu3 = new Student();
        stu1.displayInfo();
        stu2.displayInfo();
        stu3.displayInfo();
        stu3.enterInfo();
        System.out.println(Student.count);
        System.out.println(Student.University);
        Student.Hello();
    }
}
