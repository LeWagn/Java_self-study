package Queue_Stack_FIFO_LIFO.Bro_Code.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        
        // Queue = FIFO data strucutre. First-in First-out (e.g.: A line of people)
        //          A collection designed for holding elements prior to processing
        //          Linear data structure
        //            
        //          add = enqueue, offer()
        //          remove = dequeue, poll()
        //          Head = Front of the Queue, Tail = Back of the Queue

        //          Useful for?
        //          1. Keyboard Buffer (letters should appear on the screen in the order they're passed)
        //          2. Printer Queue (Print jobs should be completed in order)
        //          3. Used in LinkedLists, PriorityQueues, Breadth-first search

        //Queue is an interface so we have to instantiate a class that inherits from queue such as LinkedList
        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        System.out.println(queue);

        //offer poll and peek won't cause Exceptions even if the Queue is empty. element() will.

        //boolean if Queue is empty or not
        queue.isEmpty();
        //int value that shows # of Elements in queue
        System.out.println(queue.size());
        //boolean if Element is in queue or not
        System.out.println(queue.contains("Harold"));

    }
    
}
