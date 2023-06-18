package Linked_Lists;

public class DVL<T> implements Iterable<T> {

    private int size = 0;               //keeping track of the LinkedLists size
    private Node<T> head = null;        
    private Node<T> tail = null;
    
    //Internal node class to represent data
    private class Node<T> {
        T data;
        Node<T> prev, next; //prev, next pointers

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
    
    //Empty this linked list, O(n)
    //Goes through all Elements and de-allocates the one at a time. Does so by setting them equal to null.
    public void clear() {
        //Start to traverse at the head.
        Node<T> trav = head;
        //loop while there are still Elements in the list.
        while (trav != null) {
            Node<T> next = trav.next;
            trav.prev = trav.next = null;
            trav.data = null;
            trav = next;
        }
        //reset head and tail, set size to zero.
        head = tail = trav = null;
        size = 0;
    }

    //Return the size of this linked list
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    //Add an elment to the tail of the linked list, O(1)
    public void add(T elem) {
        addLast(elem);
    }

    //Add an element to the beginning of this linked list, O(1)
    public void addFirst(T elem) {
        //linked list is empty, set head AND tail to be equal to the new node (both its pointers are set to null since there are no other nodes)
        if (isEmpty()) {
            head = tail = new Node<T>(elem, null, null);
            //if linked list is NOT Empty, prev pointer of the head is equal to this node, set head's pointer to whatever head's previous is.
        } else {
            head.prev = new Node<T>(elem, null, head);
            head = head.prev;
        }
        //increment the size
        size++;
    }

    //add a node to the tail of the linked list, O(1)
    public void addLast(T elem) {
        //The linked list is empty -> same as with addFirst.
        if (isEmpty()) {
            head = tail = new Node<T>(elem, null, null);
            //if not empty: same as with addFirst, but we move the tail pointer.
        } else {
            tail.next = new Node<T>(elem, tail, null);
            tail = tail.next;
        }
        //increment the size
        size++;
    }

    //check the value of the first node if it exists, O(1)
    public T peekFirst() {
        if (isEmpty())
            throw new RuntimeException("Empty list");
        return head.data;
    }

    //Check the value of the last node if it exists, O(1)
    public T peekLast() {
        if (isEmpty())
            throw new RuntimeException("Empty list");
        return tail.data;
    }

    //Remove the first value at the head of the linked list, O(1)
    public T removeFirst() {
        //can't remove data from an empty list
        if (isEmpty())
            throw new RuntimeException("Empty list");

        //Extract the data at the head and move the head pointer forwards one node.
        T data = head.data;
        head = head.next;
        //decrease size
        --size;

        //if the list is empty set the tail to null as well
        if (isEmpty())
            tail = null;

        //DO a memory clean of the previous node
        else
            head.prev = null;
        //return the data that was at the first node we just removed.
        return data;
    }
    
    //Very similar to removeFirst, just using the tail now.
    public T removeLast() {
        if (isEmpty())
            throw new RuntimeException("Empty List");
        //Extract the data at the tail and move the tail pointer backwards one node
        T data = tail.data;
        tail = tail.prev;
        --size;
        //If the list is now empty set the head to null as well
        if (isEmpty())
            tail = null;
        else
            //Do a memory clean of the node that was just removed.
            head.next = null;
        return data;
    }
    
    //Remove an arbitrary node from the linked list, O(1)
    //private bc Node class itself is private, user shouldn't have access to the Node.
    //It's something we use internally to manage this datastructure.
    private T remove(Node<T> node) {
        //If the node to remove is somewhere either at the head 
        //or the tail, handle those independenly
        if (node.prev == null)
            return removeFirst();
        if (node.next == null)
            return removeLast();

        //Make the pointers of the adjacent nodes skip over "node"
        node.next.prev = node.prev;
        node.prev.next = node.next;

        //Remporary store the data we want to return
        T data = node.data;

        //Memory cleanup
        node.data = null;
        node = node.prev = node.next = null;

        --size;
        //Return the data at the node we just removed
        return data;
    }
    
    //Remove a node at a particular index, O(n)
    public T removeAt(int index) {
        //Make sure the index provided is valid
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();

        int i;
        Node<T> trav;

        //Our search depends if the index is closer to the front or the back so we don't have to traverse as much.
        //Search from the front of the lsit
        if (index < size / 2) {
            for (i = 0, trav = head; i != index; i++)
                trav = trav.next;
            //Search from the back of the list
        } else
            for (i = size - 1, trav = tail; i != index; i--)
                trav = trav.prev;

        return remove(trav);
    }
    
    //Remove a particular value in the linked list, O(n)
    public boolean remove(Object obj) {
        Node<T> trav = head;

        //SUpport searching for null
        if (obj == null) {
            //traverse the list until we find a null element. remove that node and return true.
            for (trav = head; trav != null; trav = trav.next) {
                if (trav.data == null) {
                    remove(trav);
                    return true;
                }
            }
            //Search for non null object
        } else {
            //search for the element we want to remove, use equals method to check if we found the element.
            //If yes, remove that node and return true.
            for (trav = head; trav != null; trav = trav.next) {
                if (obj.equals(trav.data)) {
                    remove(trav);
                    return true;
                }
            }
        }
        return false;
    }
    
    //Find the index of a particular value in the linked list, O(n)
    //"get" without removing.
    public int indexOf(Object obj) {
        int index = 0;
        Node<T> trav = head;

        //Support searching for null
        if (obj == null) {
            for (trav = head; trav != null; trav = trav.next, index++)
                if (trav.data == null)
                    return index;
            //Search for non null object
        } else
            for (trav = head; trav != null; trav = trav.next, index++)
                if (obj.equals(trav.data))
                    return index;
        return -1;
    }
    
    //Check if a value is contained within the linked list
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    //Iterator. Start pointer traverse at the head, travese until you reach the end.
    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node<T> trav = head;

            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }
    
    //toString Method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> trav = head;
        while (trav != null) {
            sb.append(trav.data + ", ");
            trav = trav.next;
        }
        sb.append(" ]");
        return sb.toString();
    }
    
    
}
