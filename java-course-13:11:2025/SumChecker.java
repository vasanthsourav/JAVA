public class SumChecker {
    public static void main(String[] args) {
        boolean result = hasEqualSum(1, 2, 3);
        System.out.println(result);
    }
    // write code here
    public static boolean hasEqualSum(int first, int second , int third)
    {
        int sum = first + second ;
        if (sum == third)
        {
            return true;
        }
        else{
            return false;
        }
    }
}

