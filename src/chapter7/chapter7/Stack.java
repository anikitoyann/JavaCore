package chapter7.chapter7;

public class Stack {
    private int stck[];
    private int tos;

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("stek@ liqne");
        } else {
            stck[++tos] = item;

        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("stek@ datarke");
            return 0;
        } else {}
            return stck[tos--];
        }
    }