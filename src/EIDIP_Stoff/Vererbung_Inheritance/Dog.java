package EIDIP_Stoff.Vererbung_Inheritance;

public class Dog extends Animal{
    //Method Overriding: Machen hier z.B. etwas spezifischeres für Hunde.
    @Override               //Annotation nicht nötig, aber Good Practice.
    void speak(){
        System.out.println("The dog barks");
    }
}
