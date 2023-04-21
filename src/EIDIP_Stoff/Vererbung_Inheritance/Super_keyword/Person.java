package EIDIP_Stoff.Vererbung_Inheritance.Super_keyword;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name + "\n" + this.age + "\n";
    }
}
