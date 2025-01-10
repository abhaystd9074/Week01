import java.util.Scanner;

public class Park {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1 ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3  ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;

        double totalDistance = 5*1000;

        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds +" to complete 5 km.");
    }
}
