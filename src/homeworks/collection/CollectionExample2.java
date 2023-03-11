package homeworks.collection;

import chapter14.ListExample;
import homeworks.medialCenter.model.Doctor;
import homeworks.medialCenter.model.Proffesion;

import java.util.*;

public class CollectionExample2 {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 5 name");
        try {
            String nameDataStr = scanner.nextLine();
            String[] nameData = nameDataStr.split(",");
            names.add(nameData[0]);
            names.add(nameData[1]);
            names.add(nameData[2]);
            names.add(nameData[3]);
            names.add(nameData[4]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Incorrect number of elements!!!!Please try agayin");
            return;
        }
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();


        TreeSet<String> sortName = new TreeSet<>();
        System.out.println("Please input 10 name");
        try {
            String sortname = scanner.nextLine();
            String[] sortNameData = sortname.split(",");
            sortName.add(sortNameData[0]);
            sortName.add(sortNameData[1]);
            sortName.add(sortNameData[2]);
            sortName.add(sortNameData[3]);
            sortName.add(sortNameData[4]);
            sortName.add(sortNameData[5]);
            sortName.add(sortNameData[6]);
            sortName.add(sortNameData[7]);
            sortName.add(sortNameData[8]);
            sortName.add(sortNameData[9]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Incorrect number of element!!!Please try agayin");
            return;
        }
        for (String s : sortName) {
            System.out.print(s + " ");
        }
    }
}



