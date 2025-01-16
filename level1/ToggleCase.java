import java.util.*;

public class ToggleCase {

    public static String toggleCase(String str) {
        String result = ""; // Initialize an empty string to store the result

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Toggle case using ASCII values
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase by adding 32
                result += ((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase by subtracting 32
                result += ((char) (ch - 32));
            } else {
                // Keep non-alphabetic characters as is
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = toggleCase(input);
        System.out.println("Toggled  string is: " + result);
    }
}
