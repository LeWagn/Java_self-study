package Iterator_Iterable;

import java.util.ArrayList;
import java.util.List;;

public class MyIteratorExample {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        //using our own created iterator.
        MyListIterator<String> iterator = new MyListIterator<>(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
