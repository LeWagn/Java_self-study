package EIDIP_Stoff.Grundlagen_OO;

//Recap on Constructors
public class Human {
    
    String name;
    int age;
    double weight;
    

    Human(String name, int age, double weight){
        /*name = name
         * age = age
         * weight = weight
         * --> Does not work, will return null as a value. why? Because we have not assigned the values to the specific object.
         * Will do so with this.
         */
        this.name = name;   //Pretend that "this" is replaced with human or human1 or human2 etc.
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }

    void drink(){
        System.out.println(this.name + " is drinking");
    }
}
