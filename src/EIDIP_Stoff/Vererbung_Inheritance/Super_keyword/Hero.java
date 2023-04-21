package EIDIP_Stoff.Vererbung_Inheritance.Super_keyword;

public class Hero extends Person {
    
    String power;

    Hero(String name, int age, String power){
        /*this.name = name;                       //funktioniert, ist aber umständlich, da name und age
        this.age = age;                         //schon in Person defineirt sind.*/

        super(name, age);       //greifen auf Constructor von Person zu und lassen durch diesen name und age zuweisen.
        this.power = power;
    }
    public String toString(){
        return super.toString() + this.power;   //greifen auf toString() von Person zu und erweitern um power.
    }

}
