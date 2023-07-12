package CircularBuffer;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CLLBuffer<T> {
    
    class Node {
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size;

    public void addNode(T val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty!");}
        Node h = head;
        T tmp = h.value;
        Node next = h.next;
        h.value = null;
        h.next = null;
        head = next;
        if (next == null)
            tail = null;
        else
            tail.next = head;
        size--;
        return tmp;
    }

    public boolean contains(T e) {
        Node current = head;
        if (head == null) {
            return false;
        } else {
            do{
                if(current.value == e){
                    return true;
                }
                current = current.next;
            } while (current != head);
            return false;
        }
    }

    public void deleteNode(T e) {
        Node current = head;
        if (head == null) {
            return;
        }
        do{
            Node next = current.next;
            if(next.value == e){
                if(tail == head){
                    head = null;
                    tail = null;
                } else{
                    current.next = next.next;
                    if(head == next){
                        head = head.next;
                    }
                    if(tail == next){
                        tail = current;
                    }
                }
                break;
            }
            current = next;
        } while (current != head);
    }
}
