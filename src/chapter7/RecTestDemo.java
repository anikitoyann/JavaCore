package chapter7;

public class RecTestDemo {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);

        for ( int i = 0; i < 10; i++) {
            ob.values[i]=i;

        }
        ob.printArray(10);
    }
}
