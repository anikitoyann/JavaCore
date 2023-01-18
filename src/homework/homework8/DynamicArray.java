package homework.homework8;
public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }
    private void extend() {
        int lenght = array.length + 10;
        int[] newarray = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        array = newarray;
    }
    public int getByIndex(int index) {
        if (index >0 && index < array.length) {
            return array[index];
        }
        return -1;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


    }
}
