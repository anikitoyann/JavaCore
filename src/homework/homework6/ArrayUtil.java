package homework.homework6;

public class ArrayUtil {
    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max=" + max);
    }

    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("min = " + min);
        System.out.println();
    }

    void evenCount(int[] array) {
        int evencount = 0;
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evencount++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("evencount=" + evencount++);
        System.out.println();
    }

    void oddCount(int[] array) {

        int oddcount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddcount++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("oddCount= " + oddcount++);
        System.out.println();
    }

    void sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum=" + sum);

    }

    void sort1Array(int[] array) {
        System.out.println("Numbers in ascending order");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int sort = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = sort;
                }
            }
            for (i = 0; i < array.length; i++)
                System.out.print(array[i] + ",");
            System.out.println();

        }
    }

    void sort2Array(int[] array) {
        System.out.println("Numbers in descending order");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int sort = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = sort;
                }
            }
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ",");
        System.out.println();
    }

    void charsCountOfo(char[] chars) {
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("Count of o: " + count);
    }

    void middlElem(char[] chars) {
        System.out.println("middleElement: " + chars[(chars.length / 2) - 1] + "," + chars[chars.length / 2]);
    }

    void space(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                System.out.print(chars[i]);
            }
        }
        System.out.println();

    }

    void charsSpaceExample(char[] chars) {
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                firstIndex = i;
                break;
            }
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                lastIndex = i;
                break;
            }
        }
        int j = 0;
        int lenght = lastIndex - firstIndex + 1;
        char result[] = new char[lenght];
        for (int i = firstIndex; i <= lastIndex; i++) {
            result[j] = chars[i];

            System.out.print(result[j]);
        }
        System.out.println();
    }

}