package Game;

public class Dice {
        private int faceValueDie1 = 0;
        private int faceValueDie2 = 0;
        private int sum;

        private int MAX = 6;

        public Dice() {
            faceValueDie1 = 1;
            faceValueDie2 = 1;
        }

    public int roll() {
        faceValueDie1 = (int)(Math.random() * MAX) + 1;
        faceValueDie2 = (int)(Math.random() * MAX) + 1;
        sum = faceValueDie1 + faceValueDie2;
        return sum;
    }

    public int getSum() {
        return sum;
    }

}
