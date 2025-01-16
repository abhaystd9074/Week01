import java.util.Scanner;

public class TempConverter {
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println(f + "°F is " + fahrenheitToCelsius(f) + "°C");

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println(c + "°C is " + celsiusToFahrenheit(c) + "°F");
    }
}
