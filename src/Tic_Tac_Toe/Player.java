import java.util.Scanner;

public class Player {
    int number; //Eine Zahl existiert, die später gesetzt wird.
    Scanner scanner = new Scanner(System.in);    //Nutzen Scanner für Kommandozeilen-eingabe.
    
    //Konstruktor
    public Player(int number){
        /**aktueller erstellter Spieler wird angesprochen.
        Seine number wird auf den Wert gesetzt, der in der Funktion
        übergeben wird.
        Bei Player a = new Player(number 0) würde this.number also
        das "a" hier 0 referenzieren.  */
        this.number = number;
    }

    /**Fragen wo der Spieler seine Markierung setzen will*/
    public int getTurn(){
        System.out.println("Player " + number + " - du bist am Zug!");
        int input = scanner.nextInt();  //input ist nächste eingelesene Zahl
        if(input < 9 && input >= 0){
            return input;
        }
        System.out.println("Ungültige Eingabe. Bitte Zahl zwischen 0 und 8 eingeben.");
        return getTurn(); /**Rufen bei ungültiger Eingabe funktion wieder auf.
        Solange, bis Spieler eine gültige Zahl wählt. und geben diese dann zurück.
        Ist btw. eine Rekursion.*/
    }

    /**Überprüfen, ob es sich um einen gültigen Zug handelt */
    public boolean validateTurn(int[] board, int turn){
        if(board[turn] == -1){
            return true;
        }
        return false;   //wird ausgeführt falls if condition nicht erfüllt wird.
    }
}

