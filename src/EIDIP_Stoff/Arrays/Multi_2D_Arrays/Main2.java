package EIDIP_Stoff.Arrays.Multi_2D_Arrays;

public class Main2 {
    public static void main(String[] args) {
        //2D array = Array of arrays
        //Think of it as # of rows and columns.     "Parking-Lot"

        String[][] cars = new String[3][3]; //3 Arrays with 3 Elements each
        
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        //Alternative Way to write the array:
        String [][] carz = {{"Camaro", "Corvette", "Silverado"}, 
                            {"Mustang", "Ranger", "F-150"}, 
                            {"Ferrari", "Lambo", "Tesla"}
                        };

        //outer for-loop for "rows" and inner for-loop for "columns"
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            //condition: Will continue as long as j it's smaller than the row we are currently on.
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
        System.out.println("\n \n Alternative Array Declaration (Carz) :");
        for (int a = 0; a < carz.length; a++){
            System.out.println();
            for (int b = 0; b < carz[a].length; b++) {
                System.out.print(carz[a][b] + " ");
            }
        }

    }
}
