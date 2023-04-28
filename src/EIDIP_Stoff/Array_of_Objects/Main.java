package EIDIP_Stoff.Array_of_Objects;

public class Main {
    
    public static void main(String[] args) {
        
        //
        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Pasta");
        Food food3 = new Food("Hotdog");

        //Does the same as lines 12, 21,22 and 23 :
        //Food[] refrigerator = { food1, food2, food3 };

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        //My own code: 
        for (int i = 0; i < refrigerator.length; i++) {
            System.out.println(refrigerator[i].name);
        }



    }
}
