public class KeywordsExpression {

    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);
        System.out.println("100 miles in kilometers: " + kilometers);

        int highScore = 50;
        System.out.println("Initial highScore: " + highScore);

        if (highScore > 25) {
            highScore = 1000 + highScore;     // add bonus points
            System.out.println("HighScore after bonus: " + highScore);
        }

        int health = 100;
        System.out.println("Health: " + health);

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
            System.out.println("HighScore after penalty: " + highScore);
        }
    }
}