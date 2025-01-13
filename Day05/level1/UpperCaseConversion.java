 import java.util.*;

public class UpperCaseConversion {

    public static String toUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
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
        String text = sc.nextLine();

        String builtin = text.toUpperCase();
        String userdefined = toUpperCase(text);

        boolean isEqual = compareStrings(builtin, userdefined);
        System.out.println("Comparision of results from both the menthod is" + ((builtin.equals(userdefined))?" same ":" not same " ));
        System.out.println("result  is :  "+ builtin);
    }
}
 
    

