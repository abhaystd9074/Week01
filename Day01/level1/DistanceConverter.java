public class DistanceConverter {
    public static void main(String[] args) {
        // Distance in kilometers
        double distanceKm = 10.8;

        // Conversion factor
        double distanceMiles = distanceKm * 1.6;

        // Print the result
        System.out.printf("The distance %.2f km in miles is %.2f", distanceKm, distanceMiles);
    }
}

