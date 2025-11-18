public class SpeedConverter {
    public static void main(String[] args) {
        long mph = toMilesPerHour(55.33);
        if (mph == -1) {
            System.out.println("Invalid input: negative speed");
        } else {
            System.out.println("55.33 km/h = " + mph + " mi/h");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.6);
    }
}