package chapter14;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        students.add(new Student("ani", "kitoyan", 25));
        students.add(new Student("aram", "essyan", 35));
        students.add(new Student("petros", "essyan", 14));
        for (Student student : students) {
            System.out.println(student);
        }

    }


}
