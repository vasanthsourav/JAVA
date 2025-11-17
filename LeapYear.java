public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020)); // true
        System.out.println(getDaysInMonth(2, 2020)); // 29
        System.out.println(getDaysInMonth(2, 2019)); // 28
        System.out.println(getDaysInMonth(4, 2021)); // 30
        System.out.println(getDaysInMonth(1, 2021)); // 31
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;

            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;

            case 2:  // February
                return isLeapYear(year) ? 29 : 28;

            default:
                return -1; // unreachable due to earlier validation
        }
    }
}
