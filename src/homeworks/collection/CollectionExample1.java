package homeworks.collection;

import java.text.ParseException;
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

        if (searchName(scanner, names)) return;
        if (deleteName(scanner, names)) return;
        setIndexName(scanner, names);
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

    private static boolean deleteName(Scanner scanner, ArrayList<String> names) {
        System.out.println("Input name to Delete");
        String name1 = scanner.nextLine();
        if (names.contains(name1)) {
            names.remove(name1);
            for (String s : names) {
                System.out.println(s);
            }
        } else {
            System.out.println("Wrong names");
            return true;
        }
        return false;
    }

    private static boolean searchName(Scanner scanner, ArrayList<String> names) {
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