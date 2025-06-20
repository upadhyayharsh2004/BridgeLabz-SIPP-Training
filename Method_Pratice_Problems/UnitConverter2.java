public class UnitConverter2 {

    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }
    public static double convertMetersToFeet(double meters) { return meters * 3.28084; }
    public static double convertFeetToMeters(double feet) { return feet * 0.3048; }

    public static void main(String[] args) {
        System.out.println("10 km to miles: " + convertKmToMiles(10));
        System.out.println("6 miles to km: " + convertMilesToKm(6));
        System.out.println("1 meter to feet: " + convertMetersToFeet(1));
        System.out.println("3 feet to meters: " + convertFeetToMeters(3));
    }
}