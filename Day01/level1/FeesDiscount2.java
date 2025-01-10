import java.util.Scanner;

public class FeesDiscount2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

         System.out.print("Enter the total fees: ");
        int fees = sc.nextInt();

        System.out.print("Enter the discount percentage: ");
        int discountPercent = sc.nextInt();

        // Calculate the discount amount
        int discount = (fees * discountPercent) / 100;

        // final fees after applying the discount
        int finalFees = fees - discount;

        // Display the discount amount and final fees
        System.out.println("The discount amount is INR " + discount +
                           " and the final discounted fee is INR " + finalFees);
    }
}
