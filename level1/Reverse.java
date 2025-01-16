import java.util.Scanner;

public class Reverse {

    // Method to reverse a given string
    public static String reverseStr(String str) {
        String ans = "";
        // Loop through the string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i); // Append each character to the result
        }
        return ans; // Return the reversed string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Get the reversed string
        String reversedString = reverseStr(str);
        // Print the reversed string
        System.out.println("Reversed string is : " + reversedString);
    }
    
}