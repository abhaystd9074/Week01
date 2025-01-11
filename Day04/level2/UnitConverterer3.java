import java.util.*;
public class UnitConverterer3 {

    public static double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double CelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double PoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double KilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double GallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double LitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature ");
        double temp = sc.nextDouble();
		
        System.out.println("Fahrenheit to Celsius " + FahrenheitToCelsius(temp));
        System.out.println("Celsius to Fahrenheit " + CelsiusToFahrenheit(temp));
        System.out.println("Pounds to Kilograms " + PoundsToKilograms(temp));
        System.out.println("Kilograms to Pounds " + KilogramsToPounds(temp));
        System.out.println("Gallons to Liters " + GallonsToLiters(temp));
        System.out.println("Liters to Gallons " + LitersToGallons(temp));
    }
}
