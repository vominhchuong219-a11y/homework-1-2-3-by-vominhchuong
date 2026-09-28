package Course_Enrollment_Management;

import java.util.*;

public class CourseArrayList {

    ArrayList<Course> courses = new ArrayList<>();

    void addCourseToArrayList(Course course) {
        courses.add(course);
        System.out.println("Person added successfully.");
    }
    
    void updateCourseById(String id){
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                course.updateCourse();
                System.out.println("Updated successfully!");
                return;
            }
        }
    }
    
    void deleteCourseById(String id) {
        boolean removed = courses.removeIf(course -> course.getId().equals(id));
        if (removed) {
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("Person with ID " + id + " not found.");
        }
    }
    
    void displayAllCourses(){
        if (courses.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        for (Course course : courses) {
            course.displayDetails();
            System.out.println("-------------------------");
        }
    }
    
    void displayAvailableCourses(){
        
    }
    
}
