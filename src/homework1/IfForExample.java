package homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        if (a > b) {
            System.out.println(" max= " + a);
        }
        if (a < b) {
            System.out.println(" max= " + b);
        }
        for (int i = 20; i <= 40; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (a == b) {
            System.out.println("a-ն հավասար է b");
        }
        if (a != b) {
            System.out.println("a-ն հավասար չէ b");
        }
        System.out.println((char) a);
        System.out.println((char) b);

    }
}
