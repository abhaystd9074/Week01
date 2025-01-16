import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input two dates in yyyy-MM-dd format
        System.out.println("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();
        System.out.println("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();

        // Parse the input strings into LocalDate objects
        LocalDate firstDate = LocalDate.parse(firstDateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate secondDate = LocalDate.parse(secondDateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Compare the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }

        // Close the scanner
        scanner.close();
    }
}
