package homeworks.employee;

import chapter5.Switch;

import java.util.Objects;
import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeStorage employeStorage = new EmployeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by employee ID ");
            System.out.println("Please input 4 for search employee by company name");

            String command = scanner.nextLine();
            Employee employee = new Employee();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input empleeID A1+...");
                    String empleeID = scanner.nextLine();

                    if (!empleeID.startsWith("A1")) {
                        System.err.println("wrong gender");
                        return;
                    }
                    System.out.println("Please input employee salary");
                    int salary = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input employee company");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee position");
                    String position = scanner.nextLine();
                    employee = new Employee(name, surname, empleeID, salary, company, position);
                    employeStorage.add(employee);
                    break;
                case "2":
                    employeStorage.print();
                    break;

                case "3":
                    System.out.println("Please input keyword(empleeID)");
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
}
