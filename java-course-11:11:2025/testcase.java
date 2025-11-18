public class testcase {

    public static void main(String[] args) {
    double x = 20.00;
    double y = 80.00;
    double result=(x + y ) * 100;
    System.out.println("Result is: " + result);
    double remainder=result % 40.00;
    System.out.println("Remainder is: " + remainder);
    System.out.println("Remainder is: " + remainder);
    
    boolean isNoRemainder=(remainder==0) ? true : false;
    if (!isNoRemainder) {
        System.out.println("Got some remainder");
    }
}}