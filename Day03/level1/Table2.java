import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number ");
        int number = scanner.nextInt();
        int[] res = new int[4];
        int index = 0;

        for (int i = 6; i <= 9; i++) {
            res[index] = number * i;
            index++;
        }

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + "*" + i + "=" + res[index]);
            index++;
        }
    }
}
