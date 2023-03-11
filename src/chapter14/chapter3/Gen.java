package chapter14.chapter3;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
}

class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        Gen2<Integer> iob2 = new Gen2<>(99);
        Gen2<String> strOb2 = new Gen2<>("Hello");
        if (iob2 instanceof Gen2<?>)
            System.out.println("Oбъeкт iOb2 является "
                    + "экземпляром класса Gen2");
        if (iob2 instanceof Gen<?>)
            System.out.println("Oбъeкт iOb2 является " + "экземпляром класса Gen");
        System.out.println();
        if (iob instanceof Gen2<?>)
            System.out.println("Oбъeкт iOb является"
                    + "экземпляром класса Gen2");
        if (iob instanceof Gen<?>)
            System.out.println("Oбъeкт iOb является "
                    + "экземпляром класса Gen");
    }

}
