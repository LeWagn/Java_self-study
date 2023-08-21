package Multithreading;

public class Multithreading {
    public static void main(String[] args) {

        //erzeuge 5 Threads und starte alle gleichzeitig
        for (int i = 0; i < 5; i++) {
            MultithreadThing myThing = new MultithreadThing(i);
             myThing.start();    
        }

        //myThing.run(); würde beide Hintereinander statt gleichzeitig ausführen. 
        //If one thread "blows up" all of the other ones still keep running normally.
        //Useful Methods: .join (waits for thread to die); .isAlive() returns boolean (true if still running, false if completed).
    }
}