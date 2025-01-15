import java.util.Scanner;

public class CharacterType {

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

    public static String[][] findCharacterTypes(String str) {
        // Create a 2D array to store characters and their types
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);  // Store character
            result[i][1] = checkCharacterType(ch);  // Store type
        }
        return result;
    }

    public static void displayArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " is    " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] characterTypes = findCharacterTypes(input);

        displayArray(characterTypes);
    }
}
