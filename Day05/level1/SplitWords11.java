import java.util.Scanner;

public class SplitWords11 {

    public static String[] splitWords(String str) {
        String[] words = new String[100];
        int ind = 0;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (temp.length()!=0) {
                    words[ind++] = temp;
                    temp = "";
                }
            } 
            else {
                temp += ch;
            }
        }
        if (temp.length()!=0) {
            words[ind++] = temp;
        }
        String[] result = new String[ind];
        System.arraycopy(words, 0, result, 0, ind);
        return result;
    }

    public static int getlen(String word) {
        int length = 0;
        for (char ch : word.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getlen(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter a sentance : ");
        String str = sc.nextLine();

        String[] words = splitWords(str);
        String[][] result = wordsWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
