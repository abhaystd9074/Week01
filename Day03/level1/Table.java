import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number ");
        int number = scanner.nextInt();
        int[] table = new int[10];

        for (int i = 0; i < 10; i++) {
            table[i] = number*(i+1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i+1) + " = " + table[i]);
        }
    }
}
