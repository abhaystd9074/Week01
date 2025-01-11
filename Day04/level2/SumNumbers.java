import java.util.*;
class SumNumbers {
    public static int sumUsingRecursive(int n) {
        if (n == 1) return 1;
        return n + sumUsingRecursive(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  natural number ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }

        int recursiveSum = sumUsingRecursive(n);
        int formulaSum = sumUsingFormula(n);
        System.out.println("Sum using recursion " + recursiveSum);
        System.out.println("Sum using formula " + formulaSum);
        System.out.println("Both results match " + (recursiveSum == formulaSum));
    }
}
