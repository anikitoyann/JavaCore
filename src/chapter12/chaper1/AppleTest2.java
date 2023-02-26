package chapter12.chaper1;

public class AppleTest2 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("ce константы сортов яблок и их порядковые значения:");
        Apple[] apples = Apple.values();
        for (Apple apple : apples)
            System.out.println(apple + " " + apple.ordinal());
            ap = Apple.REDDEL;
            ap2 = Apple.GOLDENDEL;
            ap3 = Apple.REDDEL;
            System.out.println();
            if (ap.compareTo(ap2) < 0) {
                System.out.println(ap + " предшествует " + ap2);
            }
            if (ap.compareTo(ap2) > 0) {
                System.out.println(ap2 + " предшествует " + ap);
            }
            if (ap.compareTo(ap3) == 0) {
                System.out.println(ap + " предшествует " + ap3);
            }
            System.out.println();
            if (ap.equals(ap2)) {
                System.out.println("Oшибкa!");
            }
            if (ap.equals(ap3)) {
                System.out.println(ap + " == " + ap3);
            }
            if (ap == ap3) {
                System.out.println(ap + " == " + ap3);
            }

    }
}
