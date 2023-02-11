package homeworks.employee;

import chapter5.Switch;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Objects;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeStorage employeStorage = new EmployeStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by  ID ");
            System.out.println("Please input 4 for search employee by company name");
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    AddEmploye();
                    break;
                case "2":
                    employeStorage.print();
                    break;

                case "3":
                    System.out.println("Please input keyword(ID)");
                    String keyword = scanner.nextLine();
                    employeStorage.search(keyword);
                    break;
                case "4":
                    System.out.println("Please input company");
                    String companyy = scanner.nextLine();
                    employeStorage.searchCompany(companyy);
                    break;
                default:
                    System.out.println("Wrong command, please try again");

            }
        }
    }
    public static void AddEmploye() {
        Employee employee = new Employee();
        System.out.println("Please input employee name");
        String name = scanner.nextLine();
        System.out.println("Please input employee surname");
        String surname = scanner.nextLine();
        System.out.println("Please input ID A1+...");
        String ID = scanner.nextLine();
        if(!ID.startsWith("A1")){
            System.out.println("should begin with A1");
            return;
        }

        System.out.println("Please input employee salary");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input employee company");
        String company = scanner.nextLine();
        System.out.println("Please input employee position");
        String position = scanner.nextLine();
        employee = new Employee(name, surname, ID, salary, company, position);
        employeStorage.add(employee);

    }
}
