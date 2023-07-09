package EIDIP_Stoff.Abstrakte_Klassen;

public class Main {

    //abstract =    abstract classes cannot be instantiated, but they can have a subclass
    //              abstract methods are declared without an implementation
    //              Adds a layer of security to the program.
    //              Abstract classes aren't *required* to have abstract methods.

    //Creating an instance of Car:
    Car car = new Car();

    //Thought: We don't want someone to come in our Shop and ask for a "vehicle" since that's too abstract.
    //So we don't want there to be an instance of vehicle. We do that by making Vehicle abstract.   Vehicle v1 = new Vehicle(); does not work anymore.
}
