package chapter14;

import java.util.PriorityQueue;
import java.util.Queue;

public class PrioretyQueueExample2 {
    public static void main(String[] args) {
       Queue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0;i<3;i++){
            priorityQueue.add(i);
            priorityQueue.add(1);
        }
        System.out.println(priorityQueue);
    }
}
