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

        System.out.print("Բոլոր զույգ էլեմենտները " + " ");
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();
        System.out.print("Բոլոր կենտ էլեմենտները" + " ");
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();
        System.out.print("Զույգերի քանակ" + " ");
        int qanak = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                qanak++;
            }
        }
        System.out.println(qanak);

        System.out.print("Կենտերի քանակ" + " ");
        int qanakk = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                qanakk++;
            }
        }
        System.out.println(qanakk);

        System.out.print("միջին թվաբանական = " + " ");
        double tvab = 0;
        for (i = 0; i < array.length; i++) {
            tvab += array[i];

        }
        System.out.println(tvab / array.length);

        System.out.print("էլեմենտների գումար = " + " ");
        int tvabb = 0;
        for (i = 0; i < array.length; i++) {
            tvabb += array[i];

        }
        System.out.println(tvabb);

        System.out.print("Մասիվի առաջին էլեմենտ =");
        for (i = 0; i < array.length; i++) {

        }
        System.out.println(array[0]);

        System.out.print("մասիվի վերգին էլեմենտ =");
        for (i = 0; i < array.length; i++) {

        }
        System.out.println(array[array.length - 1]);

        System.out.print("Մասիվի մեջտեղի էլեմենտ =");
        for (i = 0; i < array.length / 2; i++) {

        }
        System.out.println(array[i]);

    }

}



