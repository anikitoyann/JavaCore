package chapter1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }
        arrayList.remove(9);
        System.out.println(arrayList);
        arrayList=new LinkedList<>();

    }
}
