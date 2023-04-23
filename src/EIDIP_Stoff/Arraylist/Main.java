package EIDIP_Stoff.Arraylist;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        //Arraylist =   a resizable array.
        //              Elements can be added and removed after compilation phase
        //              Only store reference data types.

        ArrayList<String> food = new ArrayList<>();

        food.add("Kebab");
        food.add("Edamame");
        food.add("Pak-Choi");

        food.set(0, "Sushi"); //can replace "set" Elements with ArrayList.set 
        food.remove(2);               //Removes 3rd Element
        food.clear();                       //Arraylist emptied.

        for (int i = 0; i < food.size(); i++) { //Note: not using array.length() as ususal with arrays, but arraylist.size();
            System.out.println(food.get(i));    //get Method to get our Elements
        }
    }
}
