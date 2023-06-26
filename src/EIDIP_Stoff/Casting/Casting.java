package EIDIP_Stoff.Casting;

public class Casting {
    public static void main(String[] args) {

        //Up-Casting = Casting an Object to its Parent-Type
        //Down-Casting = Casting an Object to one of it's subtypes (Child-Classes)

        //Upcasting = Taking a Dog Object and Casting it as an Animal type.
        Animal myAnimal = (Animal) new Dog(); //Just added (Animal) here to get used to casting. it is NOT! needed here. Animal myAnimal = new Dog() works the same.
                                              //Java always allows upcasting.
                                              // Can do anything that Animal can do, but not what only dog can do.
                                              //myAnimal.growl() won't work.

        //prints out "Woof." because the myAnimal Object is a Dog. Upcasting happens in the initialization here. 
        doAnimalStuff(myAnimal);

        //If we would have created a normal Dog Object and then called the Method, the Upcasting would have happened upon The Method call.



        //Downcasting = Taking an Animal Object and Casting it as a Dog.    Hast to be done Explicitly (unlike Upcasting)
        //To SAFELY DOWNCAST:
        //Always use instanceof Check, otherwise you risk getting a ClassCastException.

    }
    
    //Can send in any animal Object but also any Sub-Type object such as a Dog.
    //Without Upcasting we'd need one doAnimalStuff Method per Object (one for Dog, one for Cat etc.)
    //Limitation: cannot used any of the Methods that are only used in the sub-classes.
    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        //animal.growl(); would not work.

        //Downcasting:
        //"I know that this animal is a dog, so cast it as a dog, so I can treat it as one."
    //Dog myDog = (Dog)animal;
        //works now.
    //myDog.growl();
        // => If we now pass in a Cat, we would get a Class Cast Exception.
        //Soluition: if clause.
        if (animal instanceof Dog) {
            Dog myDog = (Dog) animal;
            myDog.growl();
        }
        //instanceof: returns boolean whether left Object is an instance (class, subclass, interface) of the right Object
    }


    
}
