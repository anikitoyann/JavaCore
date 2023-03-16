package chapter14;

import java.util.PriorityQueue;

public class PrioretyQueueExample3 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Geeks");
        priorityQueue.add("For");
        priorityQueue.add("Geeks");
        System.out.println("After remove"+ priorityQueue);
        priorityQueue.remove("Geeks");
        System.out.println("Befor remove"+ priorityQueue);
        System.out.println("Poll Method "+ priorityQueue.peek());
        System.out.println("Final "+priorityQueue.poll());
        System.out.println("Final "+priorityQueue.poll());
        System.out.println("Final "+priorityQueue.poll());
    }
}
