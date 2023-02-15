package homeworks.employee;


import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String ID;
    private double salary;
    private String company;
    private String position;
    private boolean active = true;

    public Employee(String name, String surname, String ID, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (active != employee.active) return false;
        if (!Objects.equals(name, employee.name)) return false;
        if (!Objects.equals(surname, employee.surname)) return false;
        if (!Objects.equals(ID, employee.ID)) return false;
        if (!Objects.equals(company, employee.company)) return false;
        return Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (ID != null ? ID.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        return result;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                '}';
    }
}

