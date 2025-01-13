import java.util.Scanner;

public class DisplayIllegalArgumentException6 {

    public static void generateException(String str) {
        System.out.println(str.substring(10));
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.substring(10));
        } catch (Exception e) {
            System.out.println("Exception handled " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string ");
        String str = sc.next();
        try {
            generateException(str);
        } catch (Exception e) {
            System.out.println("Exception is generated " + e.getMessage());
        }
       handleException(str);

    }
}
 
    
