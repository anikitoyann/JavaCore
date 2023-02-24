package chapter1;

import java.text.ParseException;

public class ThrowExample {
    static void myMethod(int a) throws MyCustomException {
        if (a == 100) {
            throw new MyCustomException("number==100");
        }
        System.out.println(a);
        if (a == 200) {
            throw new MyCustomException("number==200");
        }
    }

    public static void main(String[] args) {
        MyCustomException my = new MyCustomException();

        int a = 100;
        try {
            myMethod(200);
        } catch (MyCustomException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ani");
        }

        System.out.println("End of Programm");

    }
}