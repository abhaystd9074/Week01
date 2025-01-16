import java.util.*;

public class AnagramCheck {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 >= 'a' && ch1 <= 'z') {
                count1[ch1 - 'a']++;
            } else if (ch1 >= 'A' && ch1 <= 'Z') {
                count1[ch1 - 'A']++;
            }

            if (ch2 >= 'a' && ch2 <= 'z') {
                count2[ch2 - 'a']++;
            } else if (ch2 >= 'A' && ch2 <= 'Z') {
                count2[ch2 - 'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + result);
    }
}