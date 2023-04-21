package EIDIP_Stoff.Grundlagen_OO;

public class Main{

    //object = an instance of a class that may contain attributes and methods
    //example: (phone, desk, computer, coffe cup)

    private static String b = "Audi";
    private static String c = "RS6";

    //constructor = special method that is called when an object is instantiated (created)
public static void main(String[] args) {
    /* 
    Car myCar1 = new Car();
    Car myCar2 = new Car();
    System.out.println(myCar1.make);
    System.out.println(myCar1.model);
    System.out.println(myCar1.price);

    myCar1.drive();
    myCar1.brake();
    System.out.println();

    //My own code
    System.out.println(myCar1.make("Ford"));
    System.out.println(myCar1.model("Mustang"));
    System.out.println(myCar2.make(b));
    System.out.println(myCar2.model(c));   
    */ 


    Human human = new Human("Tom", 25, 80.5);
    Human human2 = new Human("Morty", 16, 50);
    System.out.println(human.name);
    human2.eat();
    human.drink();

}
}