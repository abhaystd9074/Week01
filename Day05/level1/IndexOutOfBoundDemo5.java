import java.util.*;
public class IndexOutOfBoundDemo5 {

    public static void generateException(String str) {
       
        System.out.println(str.charAt(10));
    }

    public static void handleException(String str) {
        
        try {
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        try {
            generateException(str);
        } catch (Exception b) {
            System.out.println("Exception occurred: " + b.getMessage());
        }

        handleException(str);
    }
}
