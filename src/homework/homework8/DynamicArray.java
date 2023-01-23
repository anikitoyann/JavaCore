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
        if (index > 0 && index < array.length) {
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

    public void deleteByIndex(int index) {
        if (index >= size || index < 0) {
            System.out.println("no such element");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void set(int index, int value) {
        if (index > size || index < 0) {
            System.out.println("no such element");
            return;
        }
        for (int i = 0; i < size; i++) {
            array[index] = value;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void add(int index, int value) {
        if (index > size || index < 0) {
            System.out.println("no such element");
            return;
        }
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        for (int i = 0; i < size + 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean exists(int value) {
        boolean b = false;
        for (int val : array) {
            if (val == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;

    }
}
