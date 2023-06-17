package Linked_Lists.Bro_Code.Queues;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
    
    public static void main(String[] args) {
        
        //Priority Queue = FIFO data strucutre that serves elements
        //                  with the highest priorities first
        //                  before elements with lower priority
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("A");
        queue.offer("B");
        queue.offer("F");
        queue.offer("C");
        queue.offer("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
