package EIDIP_Stoff.Casting;

public class Dog extends Animal{

    //subclass of animal



    @Override
    public void makeNoise() {
        System.out.println("Polite Woof.");
    }

    public void growl() {
        System.out.println("Grrrrr");
    }
    
}
