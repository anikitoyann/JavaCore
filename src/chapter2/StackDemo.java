package chapter2;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(125);
        stack.push(205);
        stack.push(18);
        stack.push(225);
        Integer peek = stack.peek();
        System.out.println("Peek" + peek);
        System.out.println("Peek" + peek);
        boolean empty = stack.isEmpty();
        System.out.println(empty);
        Integer pop = stack.pop();
        System.out.println(pop);
        System.out.println(pop);
        int size = stack.size();
        System.out.println(size);
    }
}
