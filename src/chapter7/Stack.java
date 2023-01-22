package chapter7;

public class Stack {
    private int[] stck = new int[10];
    private int tos;

   public Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Ստեկը դատարկ է");
        } else stck[++tos] = item;
    }

    int pop(int i) {
        if (tos < 0) {
            System.out.println("Ստեկը տեղ չունի");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}