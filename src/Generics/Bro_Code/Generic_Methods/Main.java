package Generics.Bro_Code.Generic_Methods;

public class Main {
    public static void main(String[] args) {

        //generics =    enable types (classes and interfaces) to be parameters when defining:
        //              classes, interfaces and methods.
        //              a benefit is to eliminate the need to create multiple versions
        //              of methods or classes for various data types.
        //              Use 1 version for all reference data types.

        Integer[] intArray = { 1, 2, 3, 4, 5, };
        Double[] doubleArray = { 5.5, 2.2, 3.3, 1.4 };
        Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };
        String[] stringArray = { "sth", "written", "here" };

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));


    }

    //would normally have to write 4 seperate methods that take each Datatype as a reference 
        /**e.g. public static void displayArray(Character[] array){
            for(Character x : array){
                System.out.println(x + " ");
            }
            System.out.println();
        }
        */

    //Instead: use a generic Method
    public static <T> void displayArray(T[] array) {
        for (T x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
    
    //Generic Method that also returns a generic value:
    public static <T> T getFirst(T[] array) {
        return array[0];
    }

    
}
