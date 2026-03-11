import java.util.ArrayList;
import java.util.List;

public class CourseImpl implements Course {
    private String courseName;
    private Faculty faculty;
    private List<Student> students;
    private List<Staff> staffMembers;

    public CourseImpl(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
        this.staffMembers = new ArrayList<>();
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public Faculty getFaculty() {
        return faculty;
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public List<Staff> getStaffMembers() {
        return staffMembers;
    }

    @Override
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    @Override
    public void addStaff(Staff staff) {
        if (!staffMembers.contains(staff)) {
            staffMembers.add(staff);
        }
    }

    @Override
    public void printCourseDetails() {
        System.out.println("Faculty: " + faculty);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("\t" + student);
        }
        System.out.println("Staff:");
        for (Staff staff : staffMembers) {
            System.out.println("\t" + staff);
        }
    }
}