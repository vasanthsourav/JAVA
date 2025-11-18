public class SecondsMinutes {
public static void main(String[] args) {
    
    System.out.println(getDurationString(65, 45));
    System.out.println(getDurationString(3945));
}
public static String getDurationString(int seconds)
{
    if (seconds < 0) {
        return "Invalid value";
    }
    int minutes = seconds / 60;
    int remainingSeconds = seconds % 60;
    return getDurationString(minutes, remainingSeconds);
}
public static String getDurationString(int minutes, int seconds)
{
    if (minutes < 0 || seconds < 0 || seconds > 59) {
        return "Invalid value";
    }
    int totalSeconds = minutes * 60 + seconds;
    int hours = totalSeconds / 3600;
    int remainingMinutes = (totalSeconds % 3600) / 60;
    int remainingSeconds = totalSeconds % 60;
    return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
}
}