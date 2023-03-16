package chapter1;


import chapter3.Array;

import java.util.Arrays;

public class Repository<T> {
    private Object[] objects;
    private int size;

    Repository() {
        objects = new Object[10];
    }

    public void save(T t) {
        if (size == objects.length) {
            extend();
        }
        objects[size++] = t;

    }

    private void extend() {
        objects = Arrays.copyOf(objects, objects.length + 10);
    }

    public T get(int index) {
        return (T) objects[index];
    }
}
