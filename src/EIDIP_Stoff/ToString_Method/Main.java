package EIDIP_Stoff.ToString_Method;

import EIDIP_Stoff.Grundlagen_OO.Car;

public class Main {
    
    //to String() = special method that all objects inherit,
    //              that returns a string that "textually represents" an object.
    //              can be used both implicitly and explicitly.
    public static void main(String[] args) {
        
        Car car = new Car();
        //System.out.println(car);    Zeigt nur die Speicheradresse von car an . --> Müssen deshalb die toString() Methode overriden.   Machen das in Car.java indem wir dort eine toString Methode schreiben.  

        //ist sysout und toString() das gleiche?
        //System.out.println(someObject) calls that object's toString() function to convert the object to a string representation.

        System.out.println(car.toString());     //explizites Aufrufen von toString()
        
        System.out.println(car);                //implizites Aufrufen von toString()

    }
}
