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
            System.out.println("Please input 5 for search employee by salary range");
            System.out.println("Please input 6 for change employee position by id");
            System.out.println("Please input 7 for print only active employees");
            System.out.println("Please input 8 for inactive employee by id");
            System.out.println("Please input 9 for intactiv false` true");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmploye();
                    break;
                case "2":
                    employeStorage.print();
                    break;

                case "3":
                    searchById();
                    break;
                case "4":
                    System.out.println("Please input company");
                    String companyy = scanner.nextLine();
                    employeStorage.searchCompany(companyy);
                    break;
                case "5":
                    System.out.println("Please input 5 for search employee by salary range [a,b] ");
                    String salary = scanner.nextLine();
                    int a = Integer.parseInt(salary.split(",")[0]);
                    int b = Integer.parseInt(salary.split(",")[1]);
                    employeStorage.searchSalary(a, b);
                    break;
                case "6":
                    changePositionById();
                    System.out.println("Please input  new position");
                    String position = scanner.nextLine();
                    employeStorage.add(position);
                    break;
                case "7":
                    employeStorage.printActiv();

                    break;
                case "8":
                    inactiveEmployById();
                    System.out.println("is it active or not?");
                    String aktiv = scanner.nextLine();
                    employeStorage.addActiv(aktiv);
                    break;
                case"9":
                    inactiveEmployById();
                    System.out.println("Is it active or not");
                    String aktivv=scanner.nextLine();
                    break;
                default:
                    System.out.println("Wrong command, please try again");

            }
        }
    }

    private static void searchById() {
        System.out.println("Please input keyword(ID)");
        String id = scanner.nextLine();
        Employee employee = employeStorage.getID(id);
        if (employee == null) {
            System.out.println("emploee with" + id + "does not exsist");
        } else {
            System.out.println(employee);
        }
    }

    private static void inactiveEmployById() {
        System.out.println("Please input 8 for change employee aktiv by id.. ");
        String employID = scanner.nextLine();
        Employee employee2 = employeStorage.getID(employID);
        if (employee2 == null) {
            System.out.println("emploee with" + employID + "does not exsist");
        } else {
            System.out.println("activ=" + employee2.isActive());
        }
    }

    private static void changePositionById() {
        System.out.println("Please input 6 for change employee position by id.. ");
        String emploID = scanner.nextLine();
        Employee employee1 = employeStorage.getID(emploID);
        if (employee1 == null) {
            System.out.println("emploee with" + emploID + "does not exsist");
        } else {
            System.out.println(employee1.getPosition());
        }
    }


    public static void addEmploye() {

        System.out.println("Please input employee name,surname,ID(A1),salary,company,position");
        String emploeeDataStr = scanner.nextLine();
        String[] emploeeData = emploeeDataStr.split(",");
        String id = emploeeData[2];
        Employee employeeById = employeStorage.getID(id);
        if (employeeById == null) {
            Employee employee = new Employee(emploeeData[0], emploeeData[1], emploeeData[2], Integer.parseInt(emploeeData[3]), emploeeData[4], emploeeData[5]);
            employeStorage.add(employee);
            System.out.println("Emploee was added");
        } else {
            System.out.println("Emploee with " + id + " is alrready");
        }
    }


}
