package chapter14;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Ananas");
        map.put(1,"Mango");
        System.out.println("Iteraying Hashmap...");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
