package Game;
import java.util.Scanner;

    public class Player {
        private String name;
        Scanner input = new Scanner(System.in);
        Dice dice  = new Dice();
        private int position;
        private int turnCounter = 1;

        public Player(String name) {
            this.name = name;
            this.position =  0;
        }
}
