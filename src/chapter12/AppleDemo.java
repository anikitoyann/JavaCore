package chapter12;

public class AppleDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.REDDEL;
        System.out.println("Знaчeниe ар: " + ap);
        System.out.println();
        ap = Apple.GOLDENDEL;
        if (ap == Apple.GOLDENDEL)
            System.out.println("Переменная ар содержит GoldenDel\n");
        switch (ap) {
            case JONATHAN:
                System.out.println("Сорт Golden Delicious желтый.");
                break;
            case REDDEL:
                System.out.println("Copт Red Delicious красный.");
                break;
            case WINESAP:
                System.out.println("Copт Winesap красный.");
                break;
            case CORTLAND:
                System.out.println("Copт Cortland красный");
                break;
        }
        Apple allapples[] = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);
        System.out.println();
        ap=Apple.valueOf("REDDEL");
        System.out.println(ap);
    }
}