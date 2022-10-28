package Game;

public class Account {
    private int balance;


    public Account() {
        balance = 1000;
    }
    public int getBalance()  {
        return balance;
    }


    public void updateAccount(Player player, Square[] square) {
        balance = this.getBalance() + square[player.getPosition() - 2].getBalanceUpdate();
        if(balance < 0)
            balance = 0;
        player.setPosition(0);
    }
}