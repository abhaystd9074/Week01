import java.util.Scanner;

public class DistanceConverter2 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the distance in feet ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles
        double distanceInMiles = distanceInYards / 1760;

        // Display the results
        System.out.printf("The distance is %.2f yards and %.2f miles for the given %.2f feet.", distanceInYards, distanceInMiles, distanceInFeet);
    }
}
