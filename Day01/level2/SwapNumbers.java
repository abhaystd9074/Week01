import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the first number  ");
        int number1 = scanner.nextInt();

        System.out.print("enter the second number  ");
        int number2 = scanner.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + ", number2 = " + number2);

    }
}
