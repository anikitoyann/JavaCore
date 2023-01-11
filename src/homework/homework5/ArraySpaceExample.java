package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] array = {' ', ' ', ' ', 'c', 'a', 't', ' ', ' ', 'b', ' ', 'i', ' ', ' '};
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                firstIndex = i;
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != ' ') {
                lastIndex = i;
                break;
            }
        }
        int j = 0;
        int lenght = lastIndex - firstIndex + 1;
        char result[] = new char[lenght];
        for (int i = firstIndex; i <= lastIndex; i++) {
            result[j] = array[i];

            System.out.print(result[j]);
        }
    }
}





