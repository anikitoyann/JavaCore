package chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        //экземпляра mybox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        //экземпляра mybox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;
        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println(vol + " ");
        vol = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println(vol + " ");
    }
}
