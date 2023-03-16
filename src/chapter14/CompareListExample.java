package chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareListExample{
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ani", "Kitoyan", 25));
        studentList.add(new Student("Petros", "Poshosyan", 35));
        studentList.add(new Student("Gohar", "Esayan", 14));
        studentList.add(new Student("Gohar", "Esayan", 14));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(studentList);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
          return  o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(studentList);

    }
}