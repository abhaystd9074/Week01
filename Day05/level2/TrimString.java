import java.util.Scanner;

public class TrimString {

    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    public static String getSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] trimIndexes = trimSpaces(input);
        String trimmedString = getSubstring(input, trimIndexes[0], trimIndexes[1]);

        String builtInTrimmedString = input.trim();

        boolean isEqual = compareStrings(trimmedString, builtInTrimmedString);

        System.out.println("Trimmed String using charAt(): " + trimmedString);
        System.out.println("Trimmed String using builtin method: " + builtInTrimmedString);
        System.out.println("Are both trimmed strings equal? " + isEqual);
    }
}
