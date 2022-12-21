package chqcelgithup;

public class ArrayExample {
    public static void main(String[] args) {
        int array[] = {10, 2, 5, 35, 40, 70, 80, 7, 77, 12, 36, 35};
        int i;
//ամբողջ էլեմենտներ
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //զույգ էլեմենտներ
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();
        //կենտ էլեմենտներ
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        //զույգի քանակ
        int k = 0;
        for (i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                k = k + 1;
            }
        }
        System.out.print(k);
        System.out.println();
        //կենտի քանակ
        int l = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                l = l + 1;
            }
        }
        System.out.println(l);
        //միջին թվաբանական
        double v = 0;
        for (i = 0; i < array.length; i++) {
            v = v + array[i];
        }

        System.out.println(v / i);

        // էլեմենտների գումարը
        int t = 0;
        for (i = 0; i < array.length; i++) {
            t = t + array[i];
        }

        System.out.println(t);

        // min variabl
        int min = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println(min);

        //max variabl
        int max = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

    }


}