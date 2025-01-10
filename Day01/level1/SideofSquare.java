import java.util.Scanner;

public class SideofSquare {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

                System.out.print("Enter the perimeter of the square ");
        double perimeter = sc.nextDouble();

        // Calculate the side length of the square (side = perimeter / 4)
        double side = perimeter / 4;

        // Display the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f", side, perimeter);
    }
}

