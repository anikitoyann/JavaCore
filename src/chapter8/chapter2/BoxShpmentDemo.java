package chapter8.chapter2;

public class BoxShpmentDemo {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 30, 40, 50);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println(vol);
        System.out.println(shipment1.weight);
        System.out.println(shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println(vol);
        System.out.println(shipment2.weight);
        System.out.println(shipment2.cost);
    }

}
