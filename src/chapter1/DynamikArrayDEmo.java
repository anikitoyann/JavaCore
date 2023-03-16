package chapter1;

public class DynamikArrayDEmo {
    public static void main(String[] args) {
        DynamicArray da=new DynamicArray();
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(700);
        da.add(17);
        da.add(88);
        da.add(111);
        da.print();
        int byIndex = da.getByIndex(0);
        System.out.println(byIndex);
        da.deleteByIndex(1);
        da.print();
        da.set(2,100);
        da.print();
        da.print();
        System.out.println(da.exists(6));
        System.out.println(da.exists(600));
        System.out.println(da.getIndexByValue(6));
        System.out.println(da.getIndexByValue(600));
        da.add(6,7777);
        da.print();
    }
}
