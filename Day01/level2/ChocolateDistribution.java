import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the total number of chocolates ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("enter the number of children ");
        int numberOfChildren = scanner.nextInt();

        int chocolatesPerChild = numberOfChocolates/numberOfChildren;
        int remainingChocolates = numberOfChocolates%numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +" and the number of remaining chocolates is " + remainingChocolates);

        
    }
}
