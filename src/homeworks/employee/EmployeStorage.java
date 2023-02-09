package homeworks.employee;

public class EmployeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length - 1) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        Employee[] newarray = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        array = newarray;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }

    }
    public Object search(String ID) {
        boolean search = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().toLowerCase().contains(ID.toLowerCase())) {
                search = true;
                System.out.println(employee);
            }
        } return null;

    }


    public void searchCompany(String companyy) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().toLowerCase().contains(companyy.toLowerCase())) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println(companyy + " does not exists");
        }

    }
}
