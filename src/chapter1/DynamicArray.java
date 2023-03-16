package chapter1;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > array.length) {
            return -1;
        }
        return array[index];
    }

    //ջնջել մասիվի index-երորդ էլեմենտը
//եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {
        if (index < 0 || index > array.length) {
            System.out.println("Element chka");
        } else {

            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void set(int index, int value) {
        if (index < 0 || index > array.length) {
            System.out.println("Element chka");
        } else {
            array[index] = value;
        }
    }

    public void add(int index, int value) {
        if (index < 0 || index > array.length) {
            System.out.println("Element chka");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size; i >index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }


    public boolean exists(int value) {
        boolean b = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                b = true;
                break;
            }
        }
        return b;
    }

    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
//եթե չկա, -1
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

}
