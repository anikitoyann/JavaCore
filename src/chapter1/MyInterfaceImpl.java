package chapter1;

import java.util.Date;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void test() {
        Date date=new Date();
        System.out.println(date);
    }


    public static void main(String[] args) {
        MyInterface myInterface=new MyInterfaceImpl();
        myInterface.test();
        System.out.println(a);

    }}
