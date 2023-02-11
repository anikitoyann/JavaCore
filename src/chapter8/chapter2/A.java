package chapter8.chapter2;

public class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Члeн i в суперклассе" + super.i);
        System.out.println("Члeн i в подклассе" + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subob = new B(4, 5);
        subob.show();

    }
}
