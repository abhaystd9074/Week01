import java.util.Scanner;

public class SplitComparison {

    public static String[] customSplit(String str) {
        int wordCount = 1; 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int ind = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (temp.length() != 0) {
                    words[ind++] = temp;
                    temp = "";
                }
            } else {
                temp += ch;
            }
        }

        if (temp.length() != 0) {
            words[ind++] = temp;
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] customWords = customSplit(sentence);
        String[] builtInWords = sentence.split(" ");

        boolean isEqual = compareArrays(customWords, builtInWords);

        System.out.println("\nAre both splits equal? " + isEqual);

        System.out.println("\n Result is  ");
        for (String word : builtInWords) {
            System.out.println(word);
        }
    }
}
