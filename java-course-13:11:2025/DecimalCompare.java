 public class DecimalCompare {
    // write code here
    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(result);
    }
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2)
    {
        int first = (int) (number1 * 1000);
        int second = (int) (number2 * 1000);
        if (first == second)
        {
            return true;
        
        }else{
            return false;
        }
        
    }
} 
