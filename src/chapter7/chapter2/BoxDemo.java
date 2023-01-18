package chapter7.chapter2;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1=new Box(10,20,50);
        Box mybox2=new Box();
        Box mybox3=new Box(7);
        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mybox3.volume());
    }
}
