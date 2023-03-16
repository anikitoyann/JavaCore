package chapter2;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Stack<T> {
    private Queue<T> q1 = new LinkedList<>();
    private Queue<T> q2 = new LinkedList<>();


    //Implement the chapter2.Stack methods using only two Queue objects
    public void push(T element) {
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        q1.add(element);
        while ((!q2.isEmpty())) {
            q1.add(q2.poll());

        }
    }

    public T pop() {

        return q1.poll();
    }

    public T peek() {
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public int size() {
        return q1.size();
    }
}
