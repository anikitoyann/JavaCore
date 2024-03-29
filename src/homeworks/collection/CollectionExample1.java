package homeworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        names.add("Ani");
        names.add("Gayane");
        names.add("Ashot");
        names.add("Vardan");
        names.add("Hayastan");

        if (isName(scanner, (ArrayList<String>) names)) return;
        if (isDelete(scanner, (ArrayList<String>) names)) ;
        setIndexName(scanner, (ArrayList<String>) names);
    }

    private static void setIndexName(Scanner scanner, ArrayList<String> names) {
        System.out.println("Please input Index && Name for add");
        try {
            String nameeDataStr = scanner.nextLine();
            String[] nameData = nameeDataStr.split(",");
            String index = nameData[0];
            String name2 = nameData[1];
            names.set(Integer.parseInt(index), name2);
            for (String s : names) {
                System.out.println(s);
            }
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("no such index! Try agayin");
        } catch (NumberFormatException exc) {
            System.out.println("Format Exception ,Try agayin");
        }
    }

    private static boolean isDelete(Scanner scanner, ArrayList<String> names) {
        System.out.println("Input name to Delete");
        String name1 = scanner.nextLine();
        names.remove(name1);
        for (String s : names) {
            System.out.println(s);

        }
        return true;

    }


    private static boolean isName(Scanner scanner, ArrayList<String> names) {
        System.out.println("Input name to search");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println(name);
        } else {
            System.out.println(name + "is not in the list");
            return true;
        }
        return false;
    }
}