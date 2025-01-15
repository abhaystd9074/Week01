import java.util.Scanner;

public class FirstNonRepeating {

    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[26];
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A']++;
            }
        }

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ((ch >= 'a' && ch <= 'z' && freq[ch - 'a'] == 1) || 
                (ch >= 'A' && ch <= 'Z' && freq[ch - 'A'] == 1)) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
