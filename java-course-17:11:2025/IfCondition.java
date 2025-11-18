public class IfCondition {

    public static void main(String[] args) {
        for(int counter = 1; counter <= 19; counter++) {
            System.out.println("Counter value: " + counter);
        }
        for (int interestRate = 2; interestRate <= 8; interestRate++) {
            double interestAmount = calculateInterest(10000.0, interestRate);
            System.out.println("10,000 at " + interestRate + "% interest = " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interest) {
        return amount * (interest / 100);
    }
}