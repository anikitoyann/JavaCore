package homeworks.employee.storage;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;


    public void add(Company company) {
        if (size == companies.length) {
            extend();
        }

        companies[size++] = company;
    }

    private void extend() {
        Company[] tmp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, tmp, 0, size);
        companies = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i] + " ");
        }

    }

    public Company getCompanyID(String id) {
        for (int i = 0; i < size; i++) {
            Company company = companies[i];
            if (company.getId().equals(id)) {
                return companies[i];
            }
        }

        return null;
    }
    public int getSize(){
        return size;
    }
}
