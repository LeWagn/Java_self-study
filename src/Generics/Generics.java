package Generics;
public class Generics {
    
    //Problem: Nur Super 2 und Sub haben bar Methode. Muss deshalb Gen<Sub> statt Gen<Super> verwenden. 
    public static void main(String[] args) {
        Gen<Sub, Super> gens = new Gen<>();
        gens.value = new Sub();     //Jedes Sub ist auch ein Super, funktioniert also trotzdem.
        gens.value2 = new Super();
        gens.foofoo();

        //Rufe Generische Methode (s.u.) auf:
        Super s = Generics.foo(new Sub());
        //"new Sub()" ist das X von foo(X x) unten und erbt von Super und ist deshalb auch vom Typ super.
    }

    //Generische Methoden:
    public static <X extends Super> X foo(X x){     //Gebe etwas von Typ "X" rein, was auch ein Super ist.
        //Wende dann foo Methode auf x an.
        x.foo();
        //Und gibt x zurück.
        return x;
    }
}
