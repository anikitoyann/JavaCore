package chapter8;

public class A {
    int i,j;
    void showij(){
        System.out.println(i+" "+j);
    }
}
class B extends A {
    int k;
    void showk(){
        System.out.println(k);
    }
    void sum(){
        System.out.println((j+j+k));
    }
}
