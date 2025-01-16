import java.util.*;

public class RemoveCharacter {

    public static String removeCharacter(String str, char charToRemove) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar != charToRemove) {
                result += currentChar;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);

        String modifiedString = removeCharacter(str, charToRemove);
        System.out.println("Modified String is : " + modifiedString);
    }
}