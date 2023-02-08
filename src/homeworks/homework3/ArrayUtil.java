package homeworks.homework3;


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

        System.out.print("evencount: " + " ");
        int evencount = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evencount++;
                System.out.print(array[i] + " ");

            }
        }
        System.out.print("evencount=" + evencount++);
        System.out.println();

        int oddcount = 0;
        System.out.print("oddcount: " + " ");
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddcount++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("oddCount= " + oddcount++);
        System.out.println();

        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum=" + sum);
        System.out.println("middle sum="+sum / array.length);
        System.out.println("first element=" + array[0]);
        System.out.println("LastIndex =" + array[array.length - 1]);
        System.out.println("middle element=" + array[array.length/2]);



    }

}



