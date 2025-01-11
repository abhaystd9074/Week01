import java.util.*;
class UnitConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a distance ");
        double dis = sc.nextDouble();
	
        System.out.println(" km to miles " + convertKmToMiles(dis));
        System.out.println(" miles to km " + convertMilesToKm(dis));
        System.out.println(" meters to feet " + convertMetersToFeet(dis));
        System.out.println(" feet to meters " + convertFeetToMeters(dis));
    }
}
