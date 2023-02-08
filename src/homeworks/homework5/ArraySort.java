package homeworks.homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        System.out.println("Numbers in ascending order");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length -i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int sort = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = sort;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + ",");
        System.out.println();

        System.out.println("Numbers in descending order");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j - 1]) {
                    int sort = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = sort;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + ",");
    }
}
