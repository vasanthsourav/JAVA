public class MinutesToYearsDaysCalculator {
    // write code here
    public static void main (String[] args) {
        printYearsAndDays(561600);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(-525600);
    }
     

    public static void printYearsAndDays(long minutes)
    {
        if (minutes < 0)
        {
            System.out.println("Invalid value");
            return;
        } else
        {
            long years = minutes / 525600;
            long remainingYears = minutes % 525600; 
            long days = remainingYears / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}