public class WhileEven {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 20) {
            if (isEven(i)) {
                System.out.println("Even number: " + i);
            }
            i++;
        }
    }

    public static boolean isEven(int parameter) {
        return parameter % 2 == 0;
    }
}
