import java.util.Scanner;

public class DisplayNumberFormatException7 {

    public static void generateException(String str) {
        
        int number = Integer.parseInt(str);
        System.out.println(" number  is  " + number);
    }

    public static void handleException(String str) {
        try {
            
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(" NumberFormatException: handeled " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(" RuntimeException: handeled " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        try {
            generateException(str);
        } catch (NumberFormatException e) {
            System.out.println("Exception is generated  " + e.getMessage());
        }

        handleException(str);
    }
}
