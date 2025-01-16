import java.util.*;

public class MostFrequentCharacter {

    public static char findMostFrequentCharacter(String str) {
        int maxCount = 0;
        char mostFrequentChar = str.charAt(0);

     
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            //  count occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Update the most frequent character if needed
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = currentChar;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char mostFrequentChar = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
