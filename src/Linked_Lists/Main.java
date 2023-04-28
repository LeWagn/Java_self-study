package Linked_Lists;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        /*LinkedList =  stores Nodes in 2 parts (data + address)
         *              Nodes are in non-consecutive memory locations
         *              Elements are linked using pointers
         * 
        *                                  Singly Linked List:
         *                  Node                 Node               Node
         *              [data | address] -> [data | address] -> [data | address]
         * 
        *                                                Doubly Linked List:
        *                           Node                        Node                        Node
         *              [address| data | address] <-> [address| data | address] <-> [address| data | address]
         * 
         *              Advantages:
         *              Dynamic Data Structure (allocates needed memory while running)
         *              Insertion and Deletion of Nodes is easy. O(1)
         *              No/Low Memory Waste
         * 
         *              Disadvantages:
         *              Greater memory usage (additional pointer)
         *              No random access of elements (no index [i])
         *              Accessing/searching elements is more time consuming. O(n)
         * 
         *              uses?
         *              Implement Stacks / Queues
         *              GPS navigation
         *              Music playlists
         * 
        */
        
        
        LinkedList<String> linkedList = new LinkedList<>();
        //Can Treat LinkedList as a Stack or a Queue (can push, pop, pull etc.)
        //LinkedList as Stack:
        /**
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();    */

        //linkedList as Queue:
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        //Want to add E
        linkedList.add(4, "E");
        
        //removing E
        linkedList.remove("E");

        //searching for an Element: (shows the Index of the Element)
        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.peekFirst());
        //fügt Head hinzu
        linkedList.addFirst("0");
        //fügt Tail hinzu
        linkedList.addLast("G");

        /*können auch als variable gespeichert werden 
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();  */



        System.out.println(linkedList);
            
    }

}
