package Generics.Bro_Code.Generic_Classes;

//import java.util.ArrayList;
//import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {

        //Non-Generic Very work intensive, requires 4 Classes!
        
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Cheese");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());


        //Generic, much faster and more flexible. Requires only 1 Class.
        //should add <> behind the Class Declaration and specify what we are sending. Or we get a warning.
        MyGenericClass <Integer, Integer> myGInt = new MyGenericClass<>(1, 4);
        MyGenericClass<Double, Character> myGDouble = new MyGenericClass<>(3.14, '$');
        
        //can't use those anymore since they don't extend the Number class.
        //MyGenericClass <Character, Double> myGChar = new MyGenericClass<>('@', 1.21);
        //MyGenericClass<String, Integer> myGString = new MyGenericClass<>("Cheese", 15);

        //However, since only T and not S extends Number something like this is fine:
        MyGenericClass <Double, String> myGString = new MyGenericClass<>(1.21, "@");

        
        System.out.println(myGInt.getValue());
        System.out.println(myGDouble.getValue());
        //System.out.println(myGChar.getValue());
        System.out.println(myGString.getValue());


        //Generic with 1 Value is very similar to Arraylist, because ArrayList is actually a Generic Class.:
        //ArrayList<String> myFriends = new ArrayList<>();
        //System.out.println(myFriends);


        //Generic with 2 Values is similar to HashMaps. (Collection of Key-Value Pairs that accept Reference Datatypes)
        //HashMap<Integer, String> users = new HashMap<>();

        //
        //bounded-types: limits the Scope of Datatypes that we can send to a Generic class.
        //                  e.g. when we only want the class to receive Numbers 
        //                  (that includes Number's subclasses: Double, Float, Integer, Long, Byte etc.).

    }
}
