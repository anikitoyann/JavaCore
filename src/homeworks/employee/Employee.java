package homeworks.employee;


import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String ID;
    private int salary;
    private String company;
    private String position;

    public Employee(String name, String surname, String ID, int salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;

        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmplyeeID() {
        return ID;
    }

    public void setEmplyeeID(String emplyeeID) {
        this.ID = emplyeeID;
        }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object ID) {
        Employee atheremploy = (Employee) ID;
        return  this.ID==atheremploy.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, ID, salary, company, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeID='" + ID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
