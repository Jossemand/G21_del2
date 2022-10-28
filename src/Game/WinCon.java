package Game;

public class WinCon {
        private boolean winnerIsFound;
        private String winnerName;

        public WinCon() {
            this.winnerIsFound = false;

        }

    public boolean isWinnerIsFound() {
        return winnerIsFound;
    }

    public void checkIfplayerWon(Player  player, Account account) {
        if(account.getBalance() >= 3000 && !winnerIsFound) {
            winnerIsFound = true;
            winnerName = player.getName ();
        }
    }

    public String getWinnerName() {
        return winnerName;
    }

}
