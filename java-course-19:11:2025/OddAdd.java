public class OddAdd {
    // write code here
    public static void main(String[] args) {
        // Example run: print sum of odd numbers from 1 to 100
        System.out.println("Sum of odd numbers from 1 to 100: " + sumOdd(1, 100));
    }

    public static boolean isOdd(int parameter) {
        if (parameter <= 0) {
            return false;
        }
        return parameter % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

}