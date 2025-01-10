import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the temperature in celsius ");
        double Tempcelsius = scanner.nextDouble();

        
        double fahrenheit = (Tempcelsius * 9 / 5) + 32;

        
        System.out.println("The " + Tempcelsius + " Celsius is " + fahrenheit + " Fahrenheit");

        
    }
}
