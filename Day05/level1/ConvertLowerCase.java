import java.util.Scanner;

public class ConvertLowerCase {
    public static String Convert(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
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
        System.out.print("enter a string : ");
        String str = sc.nextLine();

        String builtin = str.toLowerCase();
        String userdef = Convert(str);

        boolean isEqual = compareStrings(builtin, userdef);
        System.out.println("Comparision of results from both the menthod is" + ((builtin.equals(userdef))?" same ":" not same " ));
        System.out.println("result  is :  "+ builtin);
    }
}
