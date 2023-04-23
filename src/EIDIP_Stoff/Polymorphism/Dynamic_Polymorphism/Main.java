package EIDIP_Stoff.Polymorphism.Dynamic_Polymorphism;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // polymorphism = many shapes/forms
        // dynamic      = after compilation (during runtime)

        //e.g. A corvette is a: corvette, and a car, and a vehicle, and an object.

        Scanner scanner = new Scanner(System.in);
        Animal animal;      //Can declare Object and make space for it in memory even if you don't know yet
                            //what Object you want yet.

        System.out.println("What animal fo you want?");
        System.out.print("( 1 = dog) or ( 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {              //Instanzieren animal als Dog oder Cat je nach choice.
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
        scanner.close();    //not necessary
    }
}
