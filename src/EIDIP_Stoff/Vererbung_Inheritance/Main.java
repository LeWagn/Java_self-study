package EIDIP_Stoff.Vererbung_Inheritance;

public class Main {
    
    public static void main(String[] args) {
        //inheritance = the process where one class acquires 
        //              the attributes and methods of another.

        Car car = new Car();

        car.go();               //Car is a descendant of the vehicle class so it inherits everything that Vehicle has.

        Bicycle bike = new Bicycle();

        bike. stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);

        //When to use inheritance?
        //If you have two or more classes that have something in common. The commonality can then put into the inheritance class (here: Vehicle). 



        //Method overriding =   declaring a method in a sub class, which is already present in a parent class.
        //                      done so that a child class can give its own implementation.

        Dog dog = new Dog();
        dog.speak();            //We have overriden the speak() method from Animal.java by implementing a new speak() Method in Dog.java.

        //Mein eigener Code:            Hund sind Tiere, Tiere sind Wesen. 
        //Being.java hat speak() Methode. Animal nicht. Dog hat die Methode wieder und überschreibt sie. 
        //--> wenn Dog.java keine speak() Methode hätte, würde er die "nächst-höhere" speak Methode suchen. 
        //Animal hat keine, also würde Dog ebenfalls die speak() Methode von Being.java nutzen.
        Animal animal = new Animal();
        animal.speak();
    }

}
