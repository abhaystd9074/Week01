import java.util.Scanner;

public class MaxOfThree {
    public static int max(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("The maximum is: " + max(a, b, c));
    }
}
