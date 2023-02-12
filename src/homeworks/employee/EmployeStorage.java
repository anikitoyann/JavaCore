package homeworks.employee;

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

    public Employee getID(String id) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];

            if (employee.getID().equals(id)) {

                return employee;
            }
        }

        return null;
    }


    public void searchCompany(String companyy) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().toLowerCase().contains(companyy.toLowerCase())) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println(companyy + " does not exists");
        }
    }

    public void searchSalary(int a, int b) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= a && employee.getSalary() <= b) {
                System.out.println(employee);
            }
        }

    }

    public void add(String position) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            employee.setPosition(position);
            System.out.println(employee);
        }
    }

    public void addActiv(String aktiv) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            employee.setActive(Boolean.parseBoolean(aktiv));
            System.out.println(employee);
        }

    }

    public void printActiv() {
        boolean isActiv = true;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.isActive()) {
                System.out.println(employees[i] + " ");
            } else {
                System.out.println("dosent activ true");
            }
        }
    }
}