package Generics.Bro_Code.Generic_Classes;

public class MyGenericClass<T extends Number, S> {

    //Variable mit Generic Datatype
    T x;
    S y;
    
    MyGenericClass(T x ,S y) {
        this.x = x;
        this.y = y;
    }
    
    public S getValue() {
        return y;
    }
}
