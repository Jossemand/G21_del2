package Game;
import java.util.Scanner;

    public class Player {
        private String name;
        Scanner input = new Scanner(System.in);
        Dice dice  = new Dice();
        private int position;
        public Player(String name) {
            this.name = name;
            this.position =  0;
        }
        public String getName() {
            return name;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
        public boolean playTurn() {
            System.out.println("");
            System.out.println("Press enter for " + getName() + " to roll");
            input.nextLine();
            dice.roll();
            System.out.println(getName() + " rolled " + dice.getSum());
            position = dice.getSum();

            if (dice.getSum() == 10)
                return true;
            else
                return false;
        }

        public void moveToSquare(Player player, Square[] square){

            switch (player.getPosition()) {
                case  2:
                    System.out.println(player.getName() + " moves to " + square[0].getSquareName());
                    System.out.println("You are accepted as a tower guard and patrols the Tower for a night shift. You are paid  " + Math.abs(square[0].getBalanceUpdate()));
                    break;
                case  3:
                    System.out.println(player.getName() + " moves to " + square[1].getSquareName());
                    System.out.println("You fall into a massive crater. You lose " + Math.abs(square[1].getBalanceUpdate()));
                    break;
                case  4:
                    System.out.println(player.getName() + " moves to " + square[2].getSquareName());
                    System.out.println("You have a successful day begging in front of the palace gates. You gain " + Math.abs(square[2].getBalanceUpdate()));
                    break;
                case  5:
                    System.out.println(player.getName() + " moves to " + square[3].getSquareName());
                    System.out.println("You wonder through the cold desert. Luckily there is a merchant selling hot chocolate. You spend " + Math.abs(square[3].getBalanceUpdate()));
                    break;
                case  6:
                    System.out.println(player.getName() + " moves to " + square[4].getSquareName());
                    System.out.println("You arrive in the safest place in the kingdom. You spend a day or two doing som errands and earn " + Math.abs(square[4].getBalanceUpdate()));
                    break;
                case  7:
                    System.out.println(player.getName() + " moves to " + square[5].getSquareName());
                    System.out.println("You visit the monastery. There is not really anything to do so you go back home");
                    break;
                case  8:
                    System.out.println(player.getName() + " moves to " + square[6].getSquareName());
                    System.out.println("You venture into the black cave in order to defeat the black bear living there. You almost die and have to pay for medical help. You lose " + Math.abs(square[6].getBalanceUpdate()));
                    break;
                case  9:
                    System.out.println(player.getName() + " moves to " + square[7].getSquareName());
                    System.out.println("You visit some huts in the mountain and find some dropped coins in the forests. You gain " + Math.abs(square[7].getBalanceUpdate()));
                    break;
                case  10:
                    System.out.println(player.getName() + " moves to " + square[8].getSquareName());
                    System.out.println("You find yourself surrounded by werewolves that rob you. You lose " + Math.abs(square[8].getBalanceUpdate()) + " ,but get an extra turn");
                    break;
                case  11:
                    System.out.println(player.getName() + " moves to " + square[9].getSquareName());
                    System.out.println("You visit the local fighting pits and gamble all day. You lose " + Math.abs(square[9].getBalanceUpdate()));
                    break;
                case  12:
                    System.out.println(player.getName() + " moves to " + square[10].getSquareName());
                    System.out.println("You find gold in the mountains and sell it all! You earn " + Math.abs(square[10].getBalanceUpdate()));
                    break;
            }
        }



}
