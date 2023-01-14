package chapter6;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack=new Stack();
        System.out.println(stack.tos);
        stack.push(4);
        stack.push(7);
        int a=stack.pop();
        System.out.println(a);
    }
}
