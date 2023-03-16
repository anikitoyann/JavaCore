package chapter1;

public class Stack {
    int[] array = new int[10];
    private int size;

    public void push(int value) {
        if (size == array.length-1) {
            extend();
        }
        array[++size] = value;

    }

    private void extend() {
        int[] newarray = new int[array.length + 10];
        System.arraycopy(array, 0, newarray, 0, array.length);
        array = newarray;
    }

    public int pop() {
        if (size <= 0) {
            System.out.println("stak@ datarke");
            return 0;
        }
        return array[size--];

    }}
