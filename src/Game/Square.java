package Game;

public class Square {

    private String name;
    private int balanceUpdate;
    private int BalanceUpdateText;

    public Square(String name, int balanceUpdateText, int balanceUpdate) {
        this.name = name;
        this.balanceUpdate = balanceUpdate;

    }
    static void createSquares(Square[] squares) {
        Square square2 = new Square("Tower", 250,+250);
        Square square3 = new Square("Crater", 100,-100);
        Square square4 = new Square("Palace gates", 100, +100);
        Square square5 = new Square("Cold Desert", 20,-20);
        Square square6 = new Square("Walled city", 180,+180);
        Square square7 = new Square("Monastery ", 0,0);
        Square square8 = new Square("Black cave ", 70,-70);
        Square square9 = new Square("Huts in the mountain", 60,+60);
        Square square10 = new Square("The Werewall", 80,-80);
        Square square11 = new Square("The pit", 50,-50);
        Square square12 = new Square("Goldmine ", 650,+650);

        squares[0] = square2;
        squares[1] = square3;
        squares[2] = square4;
        squares[3] = square5;
        squares[4] = square6;
        squares[5] = square7;
        squares[6] = square8;
        squares[7] = square9;
        squares[8] = square10;
        squares[9] = square11;
        squares[10] = square12;
    }

    public String getSquareName() {
        return name;
    }

    public int getBalanceUpdateText() {
        return BalanceUpdateText;
    }

    public int getBalanceUpdate() {
        return balanceUpdate;
    }

}
