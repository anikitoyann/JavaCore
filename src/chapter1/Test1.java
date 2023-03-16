package chapter1;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(0);
        numbers.add(145);
        numbers.add(12);
        System.out.println(numbers);
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(1777);
        numbers1.addAll(numbers);
        System.out.println(numbers1);


    }
}