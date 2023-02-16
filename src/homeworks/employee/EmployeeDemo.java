package homeworks.employee;

import chapter5.Switch;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeStorage employeStorage = new EmployeStorage();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            printCommands();
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
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company");
                    String companyy = scanner.nextLine();
                    employeStorage.searchEmployeeByCompanyName(companyy);
                    break;
                case "5":
                    searchEmployeeBySalaryRange();
                    break;
                case "6":
                    changePositionById();
                    break;
                case "7":
                    employeStorage.printByStatus(true);
                    break;
                case "8":
                    inactivateEployee();
                    break;
                case "9":
                    activatedEmployee();
                    break;
                default:
                    System.out.println("Wrong command. Please try again");

            }
        }
    }

    private static void activatedEmployee() {
        employeStorage.printByStatus(false);
        System.out.println("Please choose employee id ");
        String id = scanner.nextLine();
        Employee employee = employeStorage.getEmplooyebyID(id);
        if (employee == null || employee.isActive()) {
            System.out.println("Wrong employee id or employee is inactive,Try agayin");
        } else {
            employee.setActive(true);
            System.out.println("Status changed!");
        }
    }

    private static void inactivateEployee() {
        employeStorage.printByStatus(true);
        System.out.println("Please choose employee id ");
        String id = scanner.nextLine();
        Employee employee = employeStorage.getEmplooyebyID(id);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee id or employee is inactive,Try agayin");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }

    private static void changePositionById() {
        employeStorage.printByStatus(true);
        System.out.println("Please choose employee id ");
        String id = scanner.nextLine();
        Employee employee = employeStorage.getEmplooyebyID(id);
        if (employee == null) {
            System.out.println("Wrong employee id,Try agayin");
        } else {
            System.out.println("please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("Position changed!");
        }


    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Please input minPrice,maxPrice ");
        String salaryRangestr = scanner.nextLine();
        String[] salaryRange = salaryRangestr.split(",");
        double minPrice = Double.parseDouble(salaryRangestr.split(",")[0]);
        double maxPrice = Double.parseDouble(salaryRangestr.split(",")[1]);
        if (maxPrice < minPrice) {
            System.out.println("minPrice should be less then maxPrice!!Please Try agin");
            return;
        }
        employeStorage.searchBySeleryRange(minPrice, maxPrice);

    }


    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print all employee");
        System.out.println("Please input 3 for search employee by  ID ");
        System.out.println("Please input 4 for search employee by company name");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change position");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by id");
        System.out.println("Please input 9 for activate employee");
    }

    private static void getEmployeeById() {
        System.out.println("please input id for search");
        String id = scanner.nextLine();
        Employee employee = employeStorage.getEmplooyebyID(id);
        if (employee == null) {
            System.out.println("Employee with" + id + "id does not exists");
        } else System.out.println(employee);
    }


    public static void addEmploye() throws ParseException {
        System.out.println("Please input employee name,surname,ID(A1),salary,company,position,dataBirthday(dd/MM/yyyy)");
        String emploeeDataStr = scanner.nextLine();
        String[] emploeeData = emploeeDataStr.split(",");
        String id = emploeeData[2];
        Date data=new Date();
        String myDataStr=emploeeData[6];
        Date dataOfBirthday=sdf.parse(myDataStr);
        Employee employeeById = employeStorage.getEmplooyebyID(id);
        if (employeeById == null) {
            Employee employee = new Employee(emploeeData[0], emploeeData[1], emploeeData[2], Integer.parseInt(emploeeData[3]), emploeeData[4], emploeeData[5],dataOfBirthday);
            employeStorage.add(employee);
            System.out.println("Emploee was added");
        } else {
            System.out.println("Emploee with " + id + " is alrready");
        }


    }
}