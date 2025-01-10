import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number ");
        int num2 = scanner.nextInt();

        // Calculate quotient and remainder
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Output the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +" of two numbers " + num1 + " and " + num2);

        
    }
}
