package chapter7.chapter7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + " " + v.length + "  Содержимое:");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One ", 10);
        vaTest("Two", 15, 20, 1);
        vaTest("Three", 14, 3, 8);
    }

}