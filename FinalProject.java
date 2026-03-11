import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FinalProject {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Janet Silver", "234 Elm St", "555-5678", "janetsilver@wilmu.edu", Student.FRESHMAN);
        Student student2 = new Student("Alice Glass", "676 Poplar St", "555-2233", "aliceglass@wilmu.edu", Student.SOPHOMORE);
        Student student3 = new Student("Robert Lee", "726 Beech St", "555-3535", "robertlee@wilmu.edu", Student.JUNIOR);
        
        // Create staff members with unique titles
        Staff staff1 = new Staff("Mr. Brown", "789 Maple St", "555-2345", "mrbrown@wilmu.edu", "Office 1", 43000, LocalDate.now(), "Program Manager");
        Staff staff2 = new Staff("Ms. Black", "345 Willow St", "555-8901", "msblack@wilmu.edu", "Office 2", 42000, LocalDate.now(), "Registrar");
        Staff staff3 = new Staff("Ms. Doubtfire", "456 Walnut St", "555-9012", "msdoubtfire@wilmu.edu", "Office 3", 40000, LocalDate.now());
        Staff staff4 = new Staff("Mr. Gump", "567 Cherry St", "555-0123", "mrgump@wilmu.edu", "Office 4", 44000, LocalDate.now(), "Education Coordinator");

        // Create faculty members with a list of courses
        List<String> coursesForFaculty1 = Arrays.asList("CSC100", "CSC200");
        List<String> coursesForFaculty2 = Arrays.asList("CSC330", "CSC340");
        List<String> coursesForFaculty3 = Arrays.asList("CSC325", "CSC335");
        List<String> coursesForFaculty4 = Arrays.asList("CSC100", "CSC330");
        List<String> coursesForFaculty5 = Arrays.asList("CSC200", "CSC340");
        List<String> coursesForFaculty6 = Arrays.asList("CSC325", "CSC335");

        Faculty faculty1 = new Faculty("Dr. Smith", "456 Pine St", "555-3456", "drsmith@wilmu.edu", "Room 202", 80000, LocalDate.now(), coursesForFaculty1);
        Faculty faculty2 = new Faculty("Dr. Gupta", "123 Cedar St", "555-6789", "drgupta@wilmu.edu", "Room 203", 82000, LocalDate.now(), coursesForFaculty2);
        Faculty faculty3 = new Faculty("Dr. Greentree", "234 Birch St", "555-7890", "drgreentree@example.com", "Room 204", 81000, LocalDate.now(), coursesForFaculty3);
        Faculty faculty4 = new Faculty("Dr. Black", "345 Willow St", "555-8901", "drblack@example.com", "Room 205", 83000, LocalDate.now(), coursesForFaculty4);
        Faculty faculty5 = new Faculty("Dr. Bronson", "456 Elm St", "555-9012", "drbronson@example.com", "Room 206", 84000, LocalDate.now(), coursesForFaculty5);
        Faculty faculty6 = new Faculty("Dr. Rhodes", "567 Pine St", "555-0123", "drrhodes@example.com", "Room 207", 85000, LocalDate.now(), coursesForFaculty6);

        // Create and assign courses
        Course course1 = new CourseImpl("", faculty1);
        Course course2 = new CourseImpl("", faculty2);
        Course course3 = new CourseImpl("", faculty3);
        Course course4 = new CourseImpl("", faculty4);
        Course course5 = new CourseImpl("", faculty5);
        Course course6 = new CourseImpl("", faculty6);

        // Assign students to courses
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course2.addStudent(student1);
        course2.addStudent(student2);
        course2.addStudent(student3);
        course3.addStudent(student1);
        course3.addStudent(student3);
        course4.addStudent(student2);
        course4.addStudent(student3);
        course5.addStudent(student1);
        course5.addStudent(student2);
        course6.addStudent(student2);
        course6.addStudent(student3);

        // Assign staff to courses
        course1.addStaff(staff1);
        course1.addStaff(staff2);
        course2.addStaff(staff3);
        course2.addStaff(staff4);
        course3.addStaff(staff1);
        course4.addStaff(staff2);
        course5.addStaff(staff3);
        course6.addStaff(staff4);

        // Print course details
        course1.printCourseDetails();
        course2.printCourseDetails();
        course3.printCourseDetails();
        course4.printCourseDetails();
        course5.printCourseDetails();
        course6.printCourseDetails();
    }
}