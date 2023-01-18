package chapter7.chapter3;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box(7);
        Box mybox3 = new Box(10, 20, 30);
        Box myclone = new Box(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);
        vol = mybox3.volume();
        System.out.println(vol);
    }
}
