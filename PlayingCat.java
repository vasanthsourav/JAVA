public class PlayingCat {
    public static void main(String[] args) {
    System.out.println(isCatPlaying(true, 30));   // true
        System.out.println(isCatPlaying(false, 30));  // true
        System.out.println(isCatPlaying(true, 40));   // true
        System.out.println(isCatPlaying(false, 23));  // false
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }
}