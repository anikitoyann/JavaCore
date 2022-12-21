package chapter3;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double x = 0;
        for (int i = 0; i < 5; i++)
            x = x + nums[i];
        System.out.println(x / 5);
    }
}

