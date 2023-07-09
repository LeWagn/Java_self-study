package Iterator_Iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

        //Iteration Order (Depends on the Order that's specified in the Datastructure, not on the iterator)

public class IteratorExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("Heidi");
        list.add("Hannah");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }


        Set<String> set = new HashSet<>();
        set.add("Jane");
        set.add("Heidi");
        set.add("Hannah");

        //Different output, because of the speicifc properties of a set (set doesn't guarnatee order).
        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
