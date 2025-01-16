import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a date in yyyy-MM-dd format
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input string into a LocalDate object
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Perform date arithmetic
        LocalDate updatedDate = date.plusDays(7)      // Add 7 days
                                     .plusMonths(1)    // Add 1 month
                                     .plusYears(2)     // Add 2 years
                                     .minusWeeks(3);   // Subtract 3 weeks

        // Format the output date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Updated Date: " + updatedDate.format(formatter));

        // Close the scanner
        scanner.close();
    }
}
 
    

