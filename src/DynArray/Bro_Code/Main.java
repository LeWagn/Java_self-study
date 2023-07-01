package DynArray.Bro_Code;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        //ArrayList<String> arrayList = new ArrayList<String>();

        //Eigene Implementierung ohne ArrayList:
        //default capacity 10
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        dynamicArray.delete("E");

        /*dynamicArray.insert(4, "X");
        dynamicArray.delete("A");
        System.out.println("Searched Object is at Index " + dynamicArray.search("C"));   */

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: "+ dynamicArray.isEmpty());
    }
}
