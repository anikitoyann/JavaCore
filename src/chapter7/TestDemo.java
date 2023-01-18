package chapter7;

public class TestDemo {
    public static void main(String[] args) {
        Test ob1 = new Test(5, 7);
        Test ob2 = new Test(5, 7);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1==ob2 " + ob1.equalTo(ob2));
        System.out.println("ob1==ob2 " + ob1.equalTo(ob3));

    }
}
