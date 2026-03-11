import java.util.List;

public interface Course {
    String getCourseName();
    Faculty getFaculty();
    List<Student> getStudents();
    List<Staff> getStaffMembers();

    void addStudent(Student student);
    void addStaff(Staff staff);
    void printCourseDetails();
}
