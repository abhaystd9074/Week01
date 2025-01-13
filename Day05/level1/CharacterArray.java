import java.util.*;

public class CharacterArray {

    public static char[] Convert(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        char[] res1 = Convert(str);
        char[] res2 = str.toCharArray();

        boolean areEqual = compareArrays(res1, res2);

        System.out.println("results from both the methods are equal?  " + areEqual);
        System.out.println("result is  ");
        for (int i=0;i<res1.length;i++) {
            System.out.print(res1[i] + " ");
        }
        System.out.println();
   
    }
}

