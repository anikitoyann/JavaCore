package chapter14;

public class Storage<T> {
    int size;
    Object[] objects = new Object[10];

    public void add(T obj) {
        if (size == objects.length) {
            extend();
        }
        objects[size++] = obj;
    }

    private void extend() {
        Object[] tmp = new Object[objects.length+10];
        System.arraycopy(objects,0,tmp,0,size);
        objects=tmp;
    }

    public T getByIndex(int index) {
        return (T) objects[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(objects[i]);
        }
    }
}
