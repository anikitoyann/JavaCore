package homeworks.employee.storage;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;
import homeworks.employee.util.DateUtil;

import java.util.Date;

public class EmployeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;


    public void add(Employee value) {
        if (size == employees.length) {
            extend();
        }

        employees[size++] = value;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }

    }

    public Employee getEmplooyebyID(String id) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getEmployeeID().equals(id)) {
                return employee;
            }
        }

        return null;
    }

    public void searchEmployeeByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().equals(company)) {
                System.out.println(employee);
            }
        }
    }


    public void printByStatus(boolean isActiv) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.isActive() == isActiv) {
                System.out.println(employees[i] + " ");
            }
        }
    }

    public void searchBySeleryRange(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= minPrice && employee.getSalary() <= maxPrice) {
                System.out.println(employee);
            }
        }


    }
}

