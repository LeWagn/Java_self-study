package Tic_Tac_Toe;
/**
 * Simple Tic Tac Toe Game
 */
public class Main {
    public static void main(String[] args) {
        //Speichere Spieler, der gerade am Zug ist.
        int turn = 0;
        int winner = -1;            
        int[] board = new int[9];   //Können 9 Elemente ins board speichern.
        for(int i = 0; i < board.length; i++){ //Wollen füfr alle Stellen des boards etwas speichern.
            board[i] = -1;  //Setzen alle Werte auf -1
        }

        /**Erzeuge Spieler und Spieler-Array */
        Player a = new Player(0);
        Player b = new Player(1);
        Player[] players = new Player[2];
        players[0] = a;
        players[1] = b;

        /**Winning Condition mit while-schleife: */
        while(winner == -1){
            printBoard(board);   //Funktionsaufruf, geben Spielbrett nach jedem Zug aus.
            //bestimmen, wo Spieler an der Stelle von Turn hinsetzen möchte.
            int turnField = players[turn].getTurn();
            if(players[turn].validateTurn(board, turnField)){
                /**Falls a's Zug valide ist, setze seine Markierung an die Stelle, die a ausgewählt hat.*/
                board[turnField] = players[turn].number;
                /**Setze Erhöhe die Runde um 1 nachdem a seinen Zug gemacht hat.
                 * Verwenden Modulo um Turn-Werte von 0 und 1 zu erhalten.
                */
                turn = (turn + 1) % 2;
            }
            winner = checkWinner(board);    //Prüfen in jedem durchlauf der Schleife, ob jemand gewonnen hat.
        }
        //Geben Gewinn-Nachricht aus.
        System.out.println("Herzlichen Glückwunsch, Spieler " + winner + ". Du hast gewonnen!");
    }

    /** Überprüfen, wer gewonnen hat*/
    public static int checkWinner(int[] board) {
        int winner = -1; //-1 wenn noch niemand gewonnen hat.
        //Prüfen, ob jemand in den Zeilen gewonnen hat. Schließen default Wert -1 aus.
        if (board[0] == board[1] && board[0] == board[2] && board[0] != -1) {
            winner = board[0]; //Derjenige, der an Board[0] steht hat gewonnen (also 0 oder 1)
        } else if(board[3] == board[4] && board[3] == board[5] && board[3] != -1){
            winner = board[3];
        } else if(board[6] == board[7] && board[6] == board[8] && board[6] != -1){
            winner = board[6];
        }
        //Prüfen, ob jemand in den Spalten gewonnen hat.
        if (board[0] == board[3] && board[0] == board[6] && board[0] != -1) {
            winner = board[0]; 
        } else if(board[1] == board[4] && board[1] == board[7] && board[1] != -1){
            winner = board[1];
        } else if(board[2] == board[5] && board[2] == board[8] && board[2] != -1){
            winner = board[2];
        }
        //Prüfen, ob jemand orthogonal gewonnen hat.
        if (board[0] == board[4] && board[0] == board[8] && board[0] != -1) {
            winner = board[0]; 
        } else if(board[2] == board[4] && board[2] == board[5] && board[2] != -1){
            winner = board[2];
        }
        else{
            //Solange es noch keinen Gewinner gibt:
            winner = -1;
        }
        return winner;
    }

    //Übergeben int Array als Parameter.
    public static void printBoard(int[] meinBoard){
        System.out.println(meinBoard[0] + " | " + meinBoard[1] + " | " + meinBoard[3]);
        System.out.println("_____________");
        System.out.println(meinBoard[3] + " | " + meinBoard[4] + " | " + meinBoard[5]);
        System.out.println("_____________");
        System.out.println(meinBoard[6] + " | " + meinBoard[7] + " | " + meinBoard[8]);
    }
}
