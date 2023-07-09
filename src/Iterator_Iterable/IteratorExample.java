package Iterator_Iterable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

            //Iterate Elements with JAVA-Iterator.

public class IteratorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("Heidi");
        list.add("Hannah");

        Iterator<String> iterator = list.iterator();

        Set<String> set = new HashSet<>();
        set.add("Jane");
        set.add("Heidi");
        set.add("Hannah");

        Iterator<String> iterator2 = set.iterator();

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        //get just the keys
        Iterator<String> keyIterator = map.keySet().iterator();
        //get just the values
        Iterator<String> valueIterator = map.keySet().iterator();
        //get key-value pairs.
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
    }
    
}
