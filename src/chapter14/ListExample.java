package chapter14;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

       Set<Integer> names=new TreeSet<>();
        names.add(17);
        names.add(1);
        names.add(100);
        names.add(101);
        for (Integer name : names) {
            System.out.println(name);

        }
    }
}
