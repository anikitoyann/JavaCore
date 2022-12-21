package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int i;
        int[] array = {44, 22, 5, 8, 10, 32, 77, 11, 66, 12, 30};
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int min = array[0];
        for (i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("min = " + min);
        System.out.println();


        int max = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);


    }

}
