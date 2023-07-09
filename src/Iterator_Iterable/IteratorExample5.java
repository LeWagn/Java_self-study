package Iterator_Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample5 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("Heidi");
        list.add("Hannah");

        Iterator<String> iterator = list.iterator();
        //Lambda Expressiong gets called once for each remaining Element in the iterator.
        iterator.forEachRemaining((element) -> {
            System.out.println(element);
        });
    }
}
