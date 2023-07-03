package Queue_Stack_FIFO_LIFO;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {

    private java.util.LinkedList<T> list = new java.util.LinkedList<>();

    public Queue() {

    }
    
    public Queue(T firstEleme) {
        offer(firstEleme);
    }

    //REturn size
    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    //Peek the element at the front of the queue
    //The method throws Exception if queue is empty
    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty!");
        return list.peekFirst();
    }

    //Poll an element from the front of the queue
    //The moethod throws an error if the queue is empty
    public T poll() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty!");
        return list.removeFirst();
    }

    //Add an elemtn to the back of the queue
    public void offer(T elem) {
        list.addLast(elem);
    }

    //Return an iterator to allow the user to traverse 
    //through the elements found inside the queue
    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
