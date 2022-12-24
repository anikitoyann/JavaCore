package homework.homework2;


public class ArrayUtil {
    public static void main(String[] args) {
        int i;
        int[] array = {44, 22, 5, 8, 10, 32, 65, 11, 66, 12, 30};
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
        System.out.println();

        System.out.print("Addcount: " + " ");
        int addcount = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                addcount++;
                System.out.print(array[i] + " ");

            }
        }
        System.out.print("addcount=" + addcount++);
        System.out.println();

        int evencount = 0;
        System.out.print("evencount: " + " ");
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                evencount++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("evencount= " + evencount++);
        System.out.println();

        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum=" + sum);
        System.out.println(sum / array.length);
        System.out.println("first element=" + array[0]);
        System.out.println("last element =" + array[array.length - 1]);

        for (i = 0; i < array.length / 2; i++) {

        }
        System.out.println("middle element=" + array[i]);


    }

}



