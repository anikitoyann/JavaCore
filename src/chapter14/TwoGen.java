package chapter14;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Tип Т: " + ob1.getClass().getName());
        System.out.println("Tип V: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");
        tgObj.showTypes();
        int v = tgObj.getOb1();
        System.out.println("Знaчeниe: " + v);
        String str = tgObj.getOb2();
        System.out.println("Знaчeниe: " + str);
    }
}