package EIDIP_Stoff.Lambda_Exp;

public class Main {
    public static void main(String[] args) {
        
        //Java 8 und Neuer. shorter way to write anonymous classes with only on Method.
        //Will only be needed in Prog 2 for Testing assertThrows in Exception Testing.

        //Example:
        //  assertThrows(NoSuchElementException.class, () -> myEmptyTest.getFirst());


        /*
        String name = "Barto";
        char symbol = '!';

        //x is our name (Can call it x because we can rename variable upon receiving them.)

        //Applying Lambda-Functions to use User-Defined functional interfaces:
        MyInterface myInterface = (x, y) -> {
            System.out.println("Hello World!");
            System.out.println("Its a nice day " + x + y);
        };

        myInterface.message(name, symbol);

        MyInterface myInterface2 = (x,y) ->{
            System.out.println("Hello " + x + y);
        };
        myInterface2.message(name, symbol);
        */


        //Applying Lambda Functions to use pre-defined functional Interfaces: (e.g. Action Listener)
        //check MyFrame.java

        MyFrame myFrame = new MyFrame();

    }
}
