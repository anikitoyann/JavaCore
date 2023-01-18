package chapter7.chapter6;

public class TestDemo {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;
        ob2 = ob1.incrByTen();
        System.out.println(ob1.a);
        System.out.println(ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("оЬ2.а после второго увеличения значения:" + ob2.a);

    }
}
