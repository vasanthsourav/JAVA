public class Barking {
    public static void main(String[] args) {
        // Example usage
        boolean wakeUp = shouldWakeUp(false, 22);
        System.out.println(wakeUp);
    }

    public static boolean shouldWakeUp(boolean isBarking, int hoursOfDay) {
        if (hoursOfDay < 0 || hoursOfDay > 23) {
            return false;
        } else if (isBarking && (hoursOfDay < 8 || hoursOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }
}x