package chapter14;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        System.out.println(names.isEmpty());
        names.add("anni");
        names.add("poghos");
        names.add("martiros");
        for (String name : names) {
            System.out.println(name);

        }
        System.out.println(names.isEmpty());
    }
}
