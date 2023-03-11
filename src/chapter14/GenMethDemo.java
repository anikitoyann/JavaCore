package chapter14;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i])) return true;
        return false;
    }

    public static void main(String args[]) {
        Integer nums[] = {1, 2, 3, 4, 5};
        if (isIn(2, nums))
            System.out.println("Чиcлo 2 содержится в массиве nums");
        if (!isIn(7, nums))
            System.out.println("Чиcлo 7 отсутствует в массиве nums");
        System.out.println();
        String str[] = {"one", "two", "three"};
        if (isIn("one", str))
            System.out.println("one содержится в массиве strs");
        if (!isIn("seven", str))
            System.out.println("two отсутствует в массиве strs");
    }
}
