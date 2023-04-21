package EIDIP_Stoff.Static_keyword;

public class Friend {
    
    String name;
    //static variable:
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;  //increment the number of friends that we have.
    }

    static void displayFriends(){
        //Added if clause myself bc I thought it fit the thematic of names that I chose :)
        if(numberOfFriends > 1){
            System.out.println("You got " + numberOfFriends + " friends in me");
        } else {
        System.out.println("You got " + numberOfFriends + " friend in me");
        }
    }
}
