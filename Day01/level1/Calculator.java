import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

           System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        // Display the results of the calculations
        System.out.printf("The addition, subtraction, multiplication, and division of numbers %d and %d are %d, %d, %d, and %d respectively.", 
                        num1, num2, addition, subtraction,multiplication, division);
    }
}

