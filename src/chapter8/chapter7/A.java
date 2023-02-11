package chapter8.chapter7;

abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("Этo конкретный метод.");
    }
}

class B extends A {

    @Override
    void callme() {
        System.out.println("Реализация метода callme() в классе В");

    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        A a = new B();
        b.callme();
        b.callmetoo();
    }
}

