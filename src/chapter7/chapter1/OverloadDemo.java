package chapter7.chapter1;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob=new Overload();
        int i=88;
        int k=4;
        ob.test();
        ob.test(5.4);
        ob.test(5,7);
        ob.test(i);
        ob.test(k);

    }
}
