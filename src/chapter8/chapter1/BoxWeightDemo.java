package chapter8.chapter1;

public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.75);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println(mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println(mybox2.weight);
        vol = mybox3.volume();
        System.out.println("Oбъeм mybox3 равен " + vol);
        System.out.println(mybox3.weight);
        vol = mycube.volume();
        System.out.println("Oбъeм myclone равен" + vol);
        System.out.println(mycube.weight);
        System.out.println();
    }
}
