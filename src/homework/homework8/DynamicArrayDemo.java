package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(8);
        da.add(100);
        da.add(0);
        da.add(24);
        da.add(24);
        da.add(24);
        da.add(0);
        da.add(100);
        da.add(34);
        da.add(14);
        da.add(34);
        da.add(24);

        da.print();
        da.deleteByIndex(8);
        da.set(0, 5);
        da.add(6, 55);
        System.out.println(da.exists(100));
        System.out.println(da.getIndexByValue(24));

    }
}
