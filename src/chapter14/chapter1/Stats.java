package chapter14.chapter1;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average())
            return true;
        return false;
    }
}

class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно• " + v);

        Double nums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(nums);
        Double w = dob.average();
        System.out.println("Cpeднee значение iob равно•dob " + w);

        Float fnums[] = {1.1F, 2.2F, 3.3F, 4.4F, 5.5F};
        Stats<Double> fob = new Stats<>(nums);
        Double f = fob.average();
        System.out.println("Cpeднee значение iob равно•fob" + f);
        if (iob.sameAvg(dob)) System.out.println("paвны.");
        else System.out.println("oтличaютcя.");
        if (dob.sameAvg(fob)) System.out.println("oдинaкoвы.");
        else System.out.println("oтличaютcя");
    }

}
