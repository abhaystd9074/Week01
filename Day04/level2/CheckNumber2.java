import java.util.Scanner;

public class CheckNumber2 {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

            System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
			      String ans;
                if (isEven(numbers[i])) ans="Even";
                 else ans="Odd";
			  System.out.println("Number " + numbers[i] + " is positive and "+ ans);

            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }

        System.out.print (" comparision of first and last number is =  ");
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println(" greater ");
        } else if (result == -1) {
            System.out.println(" less ");
        } else {
            System.out.println(" equal ");
        }

    }
}
