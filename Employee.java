import java.time.LocalDate;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected LocalDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Name: " + this.name;
    }
}