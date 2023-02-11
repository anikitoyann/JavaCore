package chapter9;

public interface InStack {
    void push(int item);

    int pop();
}

class FixedStack implements InStack {
    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Steky lcvec");} else
                stck[++tos] = item;
            }


    public int pop() {
        if (tos < 0) {
            System.out.println("stek@ datarke");
            return 0;
        } else return stck[tos--];
    }

}

class IfTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(10);
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
        for (int i = 0; i < 5; i++) System.out.println(mystack1.pop());
        for (int i = 0; i < 8; i++) System.out.println(mystack2.pop());
    }
}
