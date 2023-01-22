package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(8);
        da.add(7);
        da.add(0);
        da.add(24);
        da.add(35);
        da.add(24);
        da.add(34);
        da.add(34);
        da.add(34);
        da.add(34);
        da.add(34);
        da.add(24);

        da.print();
        da.deleteByIndex(5);
        da.set(2, 5);
        da.add(1, 5);
        System.out.println(da.exists(89));
        System.out.println(da.getIndexByValue(555));

    }
}
