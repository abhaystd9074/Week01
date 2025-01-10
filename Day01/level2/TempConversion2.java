import java.util.Scanner;

public class TempConversion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in fahrenheit ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * (5.0/9);

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");

        
    }
}
