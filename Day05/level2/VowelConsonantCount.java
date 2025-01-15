import java.util.Scanner;

public class VowelConsonantCount {

    public static String checkCharacterType(char ch) {
        // Convert the character to lowercase if it's uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);  // Convert to lowercase
        }
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        
        // Check if the character is a consonant (alphabet letter)
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        
        // If it's not a letter
        return "Not a Letter";
    }

    public static int[] findVowelsAndConsonants(String str) {
        int[] counts = new int[2];  // [0] for vowels, [1] for consonants
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacterType(ch);
            if (result.equals("Vowel")) {
                counts[0]++;
            } else if (result.equals("Consonant")) {
                counts[1]++;
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] counts = findVowelsAndConsonants(input);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
}
