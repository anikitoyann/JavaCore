package chapter7.chapter7;

public class VarArgs {
    static void vaTest(int... v) {
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
    }

}
