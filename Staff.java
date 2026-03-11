import java.time.LocalDate;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired) {
        this(name, address, phoneNumber, emailAddress, office, salary, dateHired, "Support Staff");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Name: " + this.name + ", Title: " + this.title;
    }

    public String getTitle() {
        return title;
    }
}