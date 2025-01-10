import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

          System.out.print("Enter the unit price of item ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity to be bought ");
        int quantity = sc.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f", 
                          totalPrice, quantity, unitPrice);
    }
}

