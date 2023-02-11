package chapter8.chapter3;

public class A {
    A(){
        System.out.println("konstruktor A");
    }
}
class B extends A{
    B(){
        System.out.println("Konstruktor B");
    }
}
class C extends B{
    C(){
        System.out.println("Konstruktor C");
    }
}
class CallingCons{
    public static void main(String[] args) {
        C c=new C();
    }
}