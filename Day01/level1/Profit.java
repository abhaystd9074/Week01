public class Profit {
    public static void main(String[] args) {
               int costPrice = 129;
        int sellingPrice = 191;

        // Print the cost price and selling price
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);

        // Calculate profit and profit percentage
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        // Print the profit and profit percentage
        System.out.printf("The Profit is INR %d and the Profit Percentage is %.2f", profit, profitPercentage);
    }
}
