package chapter3;


public class Scope {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            int y = 55;
            System.out.println("x and y" + " " + (x + y));
            x = y * 2;
        }
        // error!!!    y=100;
        System.out.println(x);
    }
}
