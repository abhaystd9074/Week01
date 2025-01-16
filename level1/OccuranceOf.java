import java.util.*;       

public class OccuranceOf {

    // Method to find the occurrence of vowels and consonants in a string
    public static int[] FindOccurance(String str) {
        int countVowel = 0;
        int countConsonant = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                countVowel++;
            }
            // Check if the character is a consonant
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                countConsonant++;
            }
        }
        
        // Store the counts in an array and return
        int result[] = {countVowel, countConsonant};
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a string  : ");
        String str = sc.nextLine();
        
        // Get the counts of vowels and consonants
        int[] result = FindOccurance(str);
        
        // Print the counts
        System.out.println(" count of Vowels : " + result[0]);
        System.out.println(" count of Consonants : " + result[1]);
    }
}