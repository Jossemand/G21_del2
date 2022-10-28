package Game;

import java.util.Scanner;

public class Game {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Square[] board = new Square[11];
        Square.createSquares(board);
        WinCon winCon = new WinCon();

        System.out.println("Enter name of player 1");
        Player player1 = new Player(input.nextLine());
        System.out.println("Enter name of player 2");
        Player player2 = new Player(input.nextLine());

        Account accountP1 = new Account();
        Account accountP2 = new Account();

        while(!winCon.isWinnerIsFound()) {
            boolean extraTurn;
            do {
                extraTurn = player1.playTurn();
                player1.moveToSquare(player1,board);
                accountP1.updateAccount(player1,board);
                System.out.println(player1.getName() + "'s balance is now " + accountP1.getBalance());
                winCon.checkIfplayerWon(player1,accountP1);

            } while (extraTurn);

            do {
                extraTurn = player2.playTurn();
                player2.moveToSquare(player2,board);
                accountP2.updateAccount(player2,board);
                System.out.println(player2.getName() + "'s balance is now " + accountP2.getBalance());
                winCon.checkIfplayerWon(player2,accountP2);
            } while (extraTurn);
        }

        displayWinner(winCon);

    }
    private static void displayWinner(WinCon winCon) {
        System.out.println("");
        System.out.println(winCon.getWinnerName() + " has won!" );
    }

}

