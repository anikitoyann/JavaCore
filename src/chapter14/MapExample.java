package chapter14;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        //   Map<String, Student> studentMap = new HashMap<>();
        //   studentMap.put("poxos@mail.com", new Student("poxos", "poxosyan", 25));
        //   studentMap.put("petros@mail.com", new Student("petros", "poxosyan", 19));
        //  Student student = studentMap.get("petros@mail.com");
        //  System.out.println(student);
        Map<Company, Integer> companySizeMap = new TreeMap<>(new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Person poxos = new Person("Poxos", "Poxosyan");
        Person petros = new Person("Petros", "Poxosyan");
        Person martiros = new Person("martiros", "Poxosyan");
        Company company = new Company(poxos, "a001", "Company1");
        Company company3 = new Company(martiros, "a003", "Company3");
        Company company2 = new Company(petros, "a002", "Company2");
        companySizeMap.put(company3, 70);
        companySizeMap.put(company2, 20);
        companySizeMap.put(company, 40);
        company.getDirector().setName("Martiros");
        // Set<Company> companies = companySizeMap.keySet();
        // Collection<Integer> values = companySizeMap.values();
        Set<Map.Entry<Company, Integer>> entries = companySizeMap.entrySet();
        for (Map.Entry<Company, Integer> entry : entries) {
            System.out.println(entry.getKey().getName() + "-->" + entry.getValue());

        }
    }

}
