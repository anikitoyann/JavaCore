package chapter7.chapter5;

public class TestDemo {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        System.out.println("ob.a и оЬ.Ь до вызова: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println(ob.a + " " + ob.b);

    }
}
