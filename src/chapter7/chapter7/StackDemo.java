package chapter7.chapter7;

public class StackDemo {
    public static void main(String[] args) {
        Stack mystack = new Stack(5);
        for (int i = 0; i < 5; i++) {
            mystack.push(i);
        }
        System.out.println("Mystack: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mystack.pop() + " ");
        }
    }
}
