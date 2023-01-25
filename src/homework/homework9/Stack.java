package homework.homework9;

public class Stack {
    public int[] stck = new int[100];
    private int tos;

    public Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 100) {
            System.out.println("Ստեկը դատարկ է");
        } else stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            return 0;
        } else {
            return stck[tos--];
        }
    }


}
