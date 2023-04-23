package EIDIP_Stoff.Arraylist.Arraylist_2D;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        //2D Arraylists =   a dynamic list of lists
        //                  You can change the size of these lists during runtime.
        //
        //                  Basically a container for seperate Arraylists.

        //Grocery List (2D-ArrayList)
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        //Normal Arraylist for bakery goods
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic-Bread");
        bakeryList.add("Donuts");

        System.out.println(bakeryList.get(0));

        //Normal Arraylist for produce.
        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        //Normal Arraylist for drinks.
        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Soda");
        drinksList.add("Coffe");

        //Adding the individual Lists to our 2D-Arraylist.
        groceryList.add(drinksList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0)); //retrieves 1st List
        System.out.println(groceryList.get(0).get(0)); //retrieves 1st Element of 1st List



    }
}
