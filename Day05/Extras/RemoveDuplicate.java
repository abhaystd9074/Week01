import java.util.*;

public class RemoveDuplicate {
    public static String removeDuplicate(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ans.IndexOf(ch) != -1) {
                ans += ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String ans = removeDuplicate(str);
        System.out.println("String after removing duplicates is : " + ans);
    }
}
