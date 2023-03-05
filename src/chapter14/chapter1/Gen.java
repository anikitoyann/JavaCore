package chapter14.chapter1;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Tипoм Т является" + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Тест обобщений");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Знaчeниe:" + str);

    }
}