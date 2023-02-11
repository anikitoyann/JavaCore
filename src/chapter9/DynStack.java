package chapter9;

public class DynStack implements InStack {
    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
                stck = temp;
                stck[++tos] = item;
            }
        } else stck[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("stek@ datakre");
            return 0;
        } else
            return stck[tos--];
    }
}

class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 7; i++) mystack2.push(i);
        for (int i = 0; i < 5; i++) System.out.println(mystack1.pop());
        for (int i = 0; i < 7; i++) System.out.println(mystack2.pop());


    }
}

class IFtest3 {
    public static void main(String[] args) {
        InStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(7);
        mystack = ds;
        for (int i = 0; i < 5; i++) mystack.push(i);
        mystack = fs;
        for (int i = 0; i < 7; i++) mystack.push(i);
        mystack = ds;
        for (int i = 0; i < 5; i++) System.out.println(mystack.pop());
        mystack = fs;
        for (int i = 0; i < 7; i++) System.out.println(mystack.pop());


    }
}