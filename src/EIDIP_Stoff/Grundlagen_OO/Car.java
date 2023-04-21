package EIDIP_Stoff.Grundlagen_OO;

public class Car {

    String make = "BMW";
    String model = "M6";
    int year = 2020;
    String color = "blue";
    double price = 60000.00;

    void drive(){
        System.out.println("You drive the car");
    }

    void brake(){
        System.out.println("You step on the brakes");
    }


    public String make(String a){
        return "Cars Make is " + a;
    }

    public String model(String b){
        return "Cars Model is " + b;
    }
    
}
