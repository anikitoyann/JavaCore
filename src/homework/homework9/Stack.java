package homework.homework9;

public class Stack {
    public int[] stck = new int[10];
    private int tos;
    public Stack() {
        tos = -1;
    }


    void push(int item) {
        if (tos == 10) {
           return;
        } else stck[++tos] = item;
        extend();
    }

    void extend() {
        int lenght = stck.length + 10;
        int[] newstck = new int[lenght];
        for (int i = 0; i < stck.length; i++) {
            newstck[i] = stck[i];
        }
        stck = newstck;
    }


    int pop() {
        if (tos < 0) {
            return 0;
        } else {
            return stck[tos--];
        }
    }


}
