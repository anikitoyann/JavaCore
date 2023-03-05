package chapter14;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i].doubleValue();
        }
        return sum / nums.length;
    }
}

class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        Double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        Double w = dob.average();
        System.out.println("Cpeднee значение dob равно " + w);
    }
}
