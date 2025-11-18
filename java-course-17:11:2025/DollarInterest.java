public class DollarInterest {
    

    public static void main(String[] args) {
        for(float interestRate = 7.5f; interestRate <= 10.0f; interestRate += 0.25f)
        {
            double interestAmount = calculateInterest(10000.0, interestRate);
            System.out.println("10,000 at " + interestRate + "% interest = " + interestAmount);
        }
    }
    public static double calculateInterest(double amountInDollars, double Interest)
    {
        return amountInDollars * (Interest / 100);
    }
}
