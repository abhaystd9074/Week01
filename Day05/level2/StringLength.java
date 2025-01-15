import java.util.*;

public class StringLength {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int length1 = findLength(str);
        int length2 = str.length();

        System.out.println("Length using custom method: " + length1);
        System.out.println("Length using built-in method: " + length2);
    }
}
