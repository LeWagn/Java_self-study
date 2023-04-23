package EIDIP_Stoff.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        //array = used to store multiple values in a single variable.
        //arrays have to be the same datatype!

        String car = "Camaro"; //Normal Variable
        System.out.println(car);
        String[] cars = { "Camaro", "Corvette", "Tesla" }; //Array
        
        cars[0] = "Mustang";
        System.out.println(cars[0]); //changed value of Array Position 0 to Mustang, so we print Mustang.

        //different way to write an Array:
        
        String[] carz = new String[5]; //Create a new Array of String Elements, specify that we want this to have 5 Elements
                                       //note! 5 ELEMENTS. sysout(carz[5]) would be OutOfBounds since that's the 6th Element!
        carz[0] = "Camaro";
        carz[1] = "Corvette";
        carz[2] = "Tesla";

        //Iteration through our array:
        for (int i = 0; i < carz.length; i ++){
            System.out.println(carz[i]);
        }
    }
}
