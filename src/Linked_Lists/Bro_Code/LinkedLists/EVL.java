package Linked_Lists.Bro_Code.LinkedLists;

import java.util.LinkedList;

public class EVL {
    
    public static void main(String[] args) {
        

        //LinkedLists contain of a "data" and an "address" block. 
        //          The address block points to where the next data block is located in memory.
        //          e.g.: Node<e> head = 123 FakeSt.    head.data contains "A" and is located at 123 FakeSt.         => "adjacent" Nodes don't have to be stored in adjacent memory locations.
        //          head.next = 101 Help Blvd.      head.next.data contains "B" and is located at 101 Help Blvd. and so on.
        //          the last Element has a .next address of "null" because it doesn't point anywhere.

        //When inserting, you set the .next Pointer of the Element that comes before to the one that you want to insert, and the .next Pointer of
        //the Element that you insert should point to where that "before" Element was pointing to before you inserted.

        //For deleting you just let the node that is before the deleted node point to the next node instead. (e.g. B now points to D)

        //Doubly Linked Lists:
        //Also have an address for the previous node, allows you to traverse both ways.

        //ADVANTAGES:   
        //          Dynamic Data Structure (allocates needed memory while running)
        //          Insertion and Deletion of Nodes is easy. O(1)
        //          No/Low Memory Waste.

        //DISADVANTAGES:
        //          Greater memory usage (additional pointer)
        //          No random access of elements (no index[i])
        //          Accessing/searching elements is more time consuming. O(n)

        //uses?
        //          implement Stacks/Queues.    GPS navigation.     Music Playlist.



        LinkedList<String> linkedList = new LinkedList<>();
        //Methods: addFirst, removeFirst, getFirst, addLast, removeLast, getLast (also offer, poll, peek for first and last)

        //LinkedList as a StacK:
        /*
        linkedlist.push("A");
        linkedlist.push("B");
        linkedlist.push("C");
        linkedlist.push("D");
        linkedlist.push("F");
        linkedlist.pop();
        */

        //LinkedList as a Queue:
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);       

    }
}
