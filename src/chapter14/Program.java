package chapter14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public  class Program {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Armenia");
        String first = states.get(2);
        // Spain
        System.out.println(first);
        // [1,2,3,4]
        Set<Integer> keys = states.keySet();
        System.out.println(keys);
        // [Germany, Spain, Armenia, France]
        Collection<String> values = states.values();
        System.out.println(values);
        states.replace(1, "Poland");
        states.remove(2);
        for (Map.Entry<Integer, String> integerStringEntry : states.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "-->" + integerStringEntry.getValue());
        }
        Map<String, Persson> people = new HashMap<>();
        people.put("123", new Persson(" Ani"));
        people.put("125", new Persson(" Gayane"));
        people.put("156", new Persson(" Gohar"));
        for (Map.Entry<String, Persson> stringPerssonEntry : people.entrySet()) {
            System.out.println(stringPerssonEntry.getKey() + stringPerssonEntry.getValue().getName());

        }

    }

}

class Persson {
    private String name;

    Persson(String value) {
        name = value;
    }

    String getName() {
        return name;
    }
}
