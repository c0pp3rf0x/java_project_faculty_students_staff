import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Faculty extends Employee {
    private List<String> courses;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired, List<String> courses) {
       super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
       this.courses = new ArrayList<>(courses); 
    }

    public void addCourse(String courseCode) {
        if (!courses.contains(courseCode)) {
            courses.add(courseCode);
        }
    }

    public List<String> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Name: " + this.name + ", Courses: " + courses;
    }
}