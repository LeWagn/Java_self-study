package Generics;

public class Sub extends Super implements Super2 {

    @Override
    public void bar() {
        System.out.println("Sub::bar");
    }
    //hat automatisch Foo Methode von Super.java
}
