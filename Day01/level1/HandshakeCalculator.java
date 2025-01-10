import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of students: ");
        int Students = sc.nextInt();

        // Calculate the maximum number of handshakes 
        int handshakes = (Students * (Students - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes among " + Students + " students is: " + handshakes);
    }
}