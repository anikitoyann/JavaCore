package chapter14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Books {
    int id;
    String name;
    String auther;
    int quantity;

    public Books(int id, String name, String auther, int quantity) {
        this.id = id;
        this.name = name;
        this.auther = auther;
        this.quantity = quantity;
    }
}

class MapExamplee {
    public static void main(String[] args) {
        Map<Integer, Books> map = new HashMap<>();
        Books b1 = new Books(101, "Hovhannes", "Tumanyan", 125);
        Books b2 = new Books(102, "Sheqspir", "Hamlet", 1250);
        map.put(1, b1);
        map.put(2, b2);
        for (Map.Entry<Integer, Books> integerBooksEntry : map.entrySet()) {
            int key = integerBooksEntry.getKey();
            Books b = integerBooksEntry.getValue();
            System.out.println(key + " Detalis ");
            System.out.println(b.id + " " + b.name + " " + b.auther + " " + b.quantity);
        }
    }
}
