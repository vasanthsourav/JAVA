public class Calculate {
    public static void main(String[] args) {
        calculate(22, 3, 3.5);
    }

    public static void calculate(int runs, int wickets, double overs) {
        double economy = runs / overs;
        System.out.println("Economy Rate: " + economy);
        if (wickets >= 3 && economy < 6.0) {
            System.out.println("Excellent Bowling Performance");
        } else if (wickets >= 2 && economy < 7.0) {
            System.out.println("Good Bowling Performance");
        } else {
            System.out.println("Average Bowling Performance");
        }
    }
}

