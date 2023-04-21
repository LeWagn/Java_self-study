package EIDIP_Stoff.Static_keyword;

public class Main {
    
    public static void main(String[] args) {
        
        //static = modifier. A single copy of a variable/method is created and shared.
        //         The class "owns" the static member.
        //         If we create Objects from this class, they all have to share that one static variable or method.
        Friend friend1 = new Friend("Buzz");
        Friend friend2 = new Friend("Jessie");
        Friend friend3 = new Friend("Mr. Potatohead");
        
        System.out.println(Friend.numberOfFriends);     //Don't have to create an object since its a static variable.
        //If we would make numberOfFriends non static, and use friend2.numberofFriends we would get "1" which is their own number of friends (themselves).

        //static Method:
        Friend.displayFriends();

        //Another good example of a static class: 
        Math.round(1.124);        //Wouldn't make sense to create a Math object.
    }

}
