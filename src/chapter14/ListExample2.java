package chapter14;

import java.util.Set;
import java.util.TreeSet;

public class ListExample2 {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();

        students.add(new Student("ani", "kitoyan", 25));
        students.add(new Student("aam", "essyan", 35));
        students.add(new Student("petros", "essyan", 14));
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
