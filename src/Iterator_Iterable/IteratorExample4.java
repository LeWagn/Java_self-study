package Iterator_Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

        //Modyfing a collection during iteration

public class IteratorExample4 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("Heidi");
        list.add("Hannah");

        //Call list.iterator to obtain an iterator from the list.
        Iterator<String> iterator = list.iterator();
        //iteratre through the elements in the list
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //removing last element of the list
            list.remove(list.size() - 1);
            //get an error from the 2nd method-call since the list has been changed from when we created the iterator.
            //Means that the underlying collection has been modified while it's being iteratred.
            // => changed since one of the iterators we obtained has been created.

            //--> Won't get an error if we modify the list after iterating, then getting a new iterator and then modifying again:
            /*
            while (iterator.hasNext()) {
            System.out.println(iterator.next());
            }
            list.remove(list.size() -1);
            Iterator<String> iterator 2 = list.iterator();
            while(iterator2.hasNext()){
                sysout(iterator2.next());
            }       => won't produce an error. */
        }

        //can remove elements during iteration if using iterator.remove() instead of list.remove();
        Iterator<String> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
            iterator3.remove();
        }
        System.out.println(list.size());

    }
}
