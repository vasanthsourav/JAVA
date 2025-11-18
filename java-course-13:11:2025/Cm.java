public class Cm {
    
    public static void main(String[] args) {
        double cm1 = convertToCentimeters(6);
        System.out.println(cm1);
        double cm2 = convertToCentimeters(6, 5);
        System.out.println(cm2);
    }

    public static double convertToCentimeters(int heightinInches) {
        double centimeters = heightinInches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int heightinInches, int heightinFeet) {
        int totalInches = heightinFeet * 12 + heightinInches;
        double centimeters = totalInches * 2.54;
        return centimeters;
    }
}
