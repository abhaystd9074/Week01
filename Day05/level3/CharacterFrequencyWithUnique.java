import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][3];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                result[index][2] = freq[i] == 1 ? "Unique" : "Not Unique";
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character\tFrequency\tIsUnique");
        for (String[] pair : result) {
            System.out.println(pair[0] + "\t\t" + pair[1] + "\t\t" + pair[2]);
        }
    }
}
