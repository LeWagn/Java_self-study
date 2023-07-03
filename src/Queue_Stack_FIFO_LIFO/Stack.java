package Queue_Stack_FIFO_LIFO;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> implements Iterable<T> {
    LinkedList<T> list = new java.util.LinkedList<>();

    //Create an empty stack
    public Stack() {

    }
    
    //Create a Stack with an initial element
    public Stack(T firstElem) {
        push(firstElem);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    //push Element on the Stack
    private void push(T elem) {
        list.addLast(elem);
    }

    //Pop ELement off the stack 
    //Thrwos error if stack is empty.
    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        return list.removeLast();
    }
    
    //Peek the top of the stack wihtout removing an element
    //Throws exception if the stack is empty.
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return list.peekLast();
    }

    //Iterator:
    @Override
    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }
    
}
