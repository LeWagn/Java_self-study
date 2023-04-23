package EIDIP_Stoff.Polymorphism;

public class Main {
    
    public static void main(String[] args) {
        
        //polymorphism =    greek word for poly (many), morph (form)
        //                  The ability of an object to identify as more than one type.
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

        Vehicle[] racers = { car, bicycle, boat };    //Array of Objects doesnt store different Object types.
                                                   //Can solve this by Storing them in an Array of Vehicle Objects since they're all vehicles.
        /*car.go();
        bicycle.go();
        boat.go();      //Works, but is very slow. Faster and easier:*/
        
        for (Vehicle x : racers) {
            x.go(); //Go is undefined for vehicle, so go() also needs to be implemented in Vehicle.java
        }
        
        // --> car, boat, bicycle all define as themselves but also as a Vehicle And also as Objects.
    }
}
