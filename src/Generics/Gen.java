package Generics;

//Wollen Wert von Super oder Sub haben, machen das mittels extends der Oberklasse. Funktioniert ebenfalls mit Interfaces (Ausnahmsweise aber auch mit extends statt implements).
//Kann neben Super auch Super 2 sein, brauchen deshalb & Super2
public class Gen<T extends Super & Super2, S extends Super> {     //Kann mehrere Generics z.b. Gen<T,E>. Kann ebenfalls nach <> implements / extends schreiben wenn man weiteres implementieren/vererben will.
    
    public T value;
    
    //Tupelbildung: Mehrere Generics in einer Klasse vereinen.      Können beliebig viele weitere Generics angeben.
    public S value2;
    
    //Gibt zuerst Gen foo aus, dann super foo aus.
    public void foofoo(){
        System.out.println("Gen::foo");
        value.foo();
        value.bar();
        value2.foo();
    }

    /* 
    //Variablen:
    private T value;    //aktueller Wert
    private E next;     //nächster Wert
    private E before;   //Wert davor

    //Generische Methoden:
    public T gibT(){
        //müssten hier sicher Wissen, dass T ein String ist. Könnten dann casten und so alle Funktionen von String aufrufen.
        ((String)value).length();
        return value;
    }
    */
    /** Müsste eigentlich in seiner eigenen Klasse sein, hier nur zu veranschaulichungszwecken bzgl. Vererbung.
     * Vererbung darf niemals allgemeiner werden sondern nur spezieller. (Darf also immer die Unterklassen angeben aber niemals die Oberklassen beim Erben.)
    public class Subgen<T extends Sub> extends Gen<T>{
    }
    */
}
