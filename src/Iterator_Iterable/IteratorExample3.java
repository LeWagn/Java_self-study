package Iterator_Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

            //Java Iterator with generic type

public class IteratorExample3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jane");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
        }

        //non-generic:
        List list2 = new ArrayList();
        list2.add("Jane");

        //Will have to cast here since its non-generic and we otherwise won't know which type the Elements will be.
        //Good practice to use specific type if possible as seen above.
        Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            String next = (String) iterator2.next();
        }

    }
}
