package chapter7;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob=new Overload();
        double result;
        ob.test();
        ob.test(25);
        ob.test(4,7);
        result=ob.test(123.5);
        System.out.println(result);

    }
}
