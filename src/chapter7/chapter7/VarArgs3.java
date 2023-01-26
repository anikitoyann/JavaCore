package chapter7.chapter7;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print(v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print(v.length + " Содержимое: ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    static void vaTest(String msg, int... v) {
        System.out.print(v.length + " " + msg + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(4, 7, 9);
        vaTest(true, false, true);
        vaTest("Ani", 29);
       // vaTest()  Ошибка: неоднозначность!
    }
}
