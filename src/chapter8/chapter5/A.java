package chapter8.chapter5;

public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

   void show() {
        System.out.println(i + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println(k);
    }
}

class Override {
    public static void main(String[] args) {
        B subob = new B(1, 2, 3);
        subob.show();
    }
}
