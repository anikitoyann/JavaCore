package chapter7;

public class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i == 0){ return;}
        else{ printArray(i - 1);}
        System.out.println(values[i - 1]);

    }

}
