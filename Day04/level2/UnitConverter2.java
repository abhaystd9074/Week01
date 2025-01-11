import java.util.*;
class UnitConverter2 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length ");
        double dis = sc.nextDouble();
		
        System.out.println("yards to feet: " + convertYardsToFeet(dis));
        System.out.println("feet to yards: " + convertFeetToYards(dis));
        System.out.println("meters to inches: " + convertMetersToInches(dis));
        System.out.println("inches to meters: " + convertInchesToMeters(dis));
        System.out.println("inches to cm: " + convertInchesToCm(dis));
    }
}