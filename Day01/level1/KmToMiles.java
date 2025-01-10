import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
              double km;
        
         System.out.print("Enter the distance in kilometers ");
        km = sc.nextDouble();
        
        // Convert kilometers to miles
        double mile = km * 1.6;
        
        // Display the result in miles with three decimal places
        System.out.printf("The total miles is %.3f miles for the given %.3f km.", mile, km);
    }
}

