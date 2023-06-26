package EIDIP_Stoff.Equals;

public class EqualsTutorial {
    public static void main(String[] args) {
        
        int int1 = 3;
        int int2 = 4;

        String string1 = new String("hello");    //Creates new Object at a new Memory Location and then creates variable string1 that points to that memory location.
        String string2 = new String("hello");    //If we used String literals instead (String string1 = "Hello") and both of those have the same content, 
                                                          //java would hold that Literal in one memory location and point both variables to it, which is why == works again. (=Interning)

        // == Compares the Memory Location of the objects, so we got false, since string1 and string2 have different memory locations.

        // Works for primitive types (Number Class) since it refers to their actual value and not their memory location.

        // So: == should only be used when comparing 2 primitive types.


        if (int1 == int2) {
            System.out.println("Numbers are Equal");
        } else {
            System.out.println("Numbers are not Equal");
        }

        //Doens't Work, unless we Use String Literals (String string1 = "hello") instead of String objects.
        if (string1 == string2) {
            System.out.println("Strings are == Equal");
        } else {
            System.out.println("Strings are not == Equal");
        }

        //What if we don't have a primitive Type such as a String?
        // => .equals Method

        if (string1.equals(string2)) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }

        //Implement your own equals Method:
        Dog myDog = new Dog();
        Dog yourDog = new Dog();
        
        //will show false unless I implement .equals in my Dog class since it otherwise just uses the Object.equals Method which returns this == obj.
        if (myDog.equals(yourDog)) {
            System.out.println("Dogs are Equal");
        } else {
            System.out.println("Dogs are not Equal");
        }



    }
    
}
