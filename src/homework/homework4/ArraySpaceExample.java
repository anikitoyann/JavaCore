package homework.homework4;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] array = {' ', ' ', 'c', 'a', 't', ' ', ' ', 'b', ' ', 'i', ' ', ' '};
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                startIndex = i;
                i++;
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != ' ') {
                endIndex = i;
                break;
            }
        }
        int j = 0;
        int lenght = endIndex - startIndex + 1;
        char result[] = new char[lenght];
        for (int i = startIndex; i <= endIndex; i++) {
            result[j] = array[i];

            System.out.print(result[j]);
        }
    }
}





