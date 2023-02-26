package chapter12.chaper1;

import chapter12.Apple;

public class AppleTest {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Яблoкo сорта Winesap стоит"+ chapter12.chaper1.Apple.WINESAP.getPrice()+" \n");
        System.out.println("Цeны на все сорта яблок:");
        chapter12.chaper1.Apple[] apples= chapter12.chaper1.Apple.values();
        for (chapter12.chaper1.Apple apple:apples) {
            System.out.println(apple +" стоит "+apple.getPrice()+ " центов. ");
        }


    }
}
