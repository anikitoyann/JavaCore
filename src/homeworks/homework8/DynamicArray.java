package homeworks.homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if ( size==array.length - 1) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        int[] newarray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        array = newarray;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong Index");
            return -1;
        }
        return array[index];
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

        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
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
        if (size == array.length) {
            extend();
        }
        for (int i = size; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public boolean exists(int value) {
        boolean b = false;
        for (int val : array) {
            if (val == value) {
                b = true;
                break;
            }
        }
        return b;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }
}
