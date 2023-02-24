package homeworks.employee;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;
import homeworks.employee.storage.CompanyStorage;
import homeworks.employee.storage.EmployeStorage;
import homeworks.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeStorage employeStorage = new EmployeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        Company company = new Company("a1a", "epam", "Shirakaci 104", "+374955555");
        company.setEmployeeCount(3);
        companyStorage.add(company);
        employeStorage.add(new Employee("Ani", "Kitoyan", "a1a", 125000, company, "jr.manager", new Date(), DateUtil.stringToDate("04/25/2026")));
        employeStorage.add(new Employee("Gayne", "Kitoyan", "a2a", 225000, company, "manager", new Date(), DateUtil.stringToDate("23/03/94")));
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmploye();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeeById();
                    break;
                case SERACH_EMPLOYEE_COMPANY_ID:
                    serachEmployeeCompanyId();
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeeBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changePositionById();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYE:
                    employeStorage.printByStatus(true);
                    break;
                case INACTIVATE_EMPLOYE_BY_ID:
                    inactivateEployee();
                    break;
                case ACTIVATE_EMPLOYE_BY_ID:
                    activatedEmployee();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("Wrong command. Please try again");

            }
        }
    }

    private static void serachEmployeeCompanyId() {
        companyStorage.print();
        System.out.println("Please input company");
        String companyyID = scanner.nextLine();
        Company companyID = companyStorage.getCompanyID(companyyID);
        if (companyID != null) {
            employeStorage.searchEmployeeByCompany(companyID);
        } else {
            System.out.println("Company does not exists!!");
        }
    }

    private static void addCompany() {
        try {
            System.out.println("Please input id,name,address,phoneNumber");
            String companyDataStr = scanner.nextLine();
            String[] companyData = companyDataStr.split(",");
            String companyId = companyData[0];
            Company companyByID = companyStorage.getCompanyID(companyId);
            if (companyByID == null) {
                Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
                companyStorage.add(company);
                System.out.println("Company was added!!!");
            } else {
                System.out.println("Company with" + companyId + "already exsist");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("with the wrong amount");
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
        try {
            double minPrice = Double.parseDouble(salaryRangestr.split(",")[0]);
            double maxPrice = Double.parseDouble(salaryRangestr.split(",")[1]);
            if (maxPrice < minPrice) {
                System.out.println("minPrice should be less then maxPrice!!Please Try agin");
                return;
            }
            employeStorage.searchBySeleryRange(minPrice, maxPrice);

        } catch (NumberFormatException e) {
            System.out.println("Incorrect number values,please try again");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please input max and min");
        }
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
        try {

            if (companyStorage.getSize() == 0) {
                System.out.println("please add company first!");
            }
            companyStorage.print();
            System.out.println("please choose company id");
            String companyId = scanner.nextLine();
            Company companyByID = companyStorage.getCompanyID(companyId);
            if (companyByID != null) {
                System.out.println("Please input employee name,surname,ID(A1),salary,position,dataOfBirthday(dd/MM/yyyy)");
                String emploeeDataStr = scanner.nextLine();
                String[] emploeeData = emploeeDataStr.split(",");
                String id = emploeeData[2];
                Employee employeeById = employeStorage.getEmplooyebyID(id);
                if (employeeById == null) {
                    Employee employee = new Employee(emploeeData[0], emploeeData[1], emploeeData[2], Integer.parseInt(emploeeData[3]), companyByID, emploeeData[4], new Date(), DateUtil.stringToDate(emploeeData[5]));
                    employeStorage.add(employee);
                    companyByID.setEmployeeCount(companyByID.getEmployeeCount() + 1);
                    System.out.println("Emploee was added");
                } else {
                    System.out.println("Emploee with " + id + " is alrready");
                }
            } else System.out.println("Wrong Company Id,Plesase Try agayin");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("with the wrong amount");
        }
    }
}