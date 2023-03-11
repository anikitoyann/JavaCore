package homeworks.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Ani");
        names.add("Gayane");
        names.add("Ashot");
        names.add("Vardan");
        names.add("Hayastan");

        System.out.println("Input name to search");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println(name);
        } else {
            System.out.println(name + "is not in the list");
            return;
        }

        System.out.println("Input name to Delete");
        String name1 = scanner.nextLine();
        if (names.contains(name1)) {
            names.remove(name1);
            for (String s : names) {
                System.out.println(s);
            }
        } else {
            System.out.println("Wrong names");
            return;
        }

        System.out.println("Please input Index && Name for add");
        String nameeDataStr = scanner.nextLine();
        String[] nameData = nameeDataStr.split(",");
        String index = nameData[0];
        String name2 = nameData[1];
        names.set(Integer.parseInt(index), name2);
        for (String s : names) {
            System.out.println(s);

        }
    }
}