public class FeesDiscount {
    public static void main(String[] args) {
       
        int fees = 125000;
        int discountPercent = 10;

        // Calculate the discount and final fees
        int discount = (fees * discountPercent) / 100;
        int finalFees = fees - discount;

        // Print the discount and final fees
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFees);
    }
}