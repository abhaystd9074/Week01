import java.util.Scanner;

public class Palindrome {

    // Method to reverse a given string
    public static boolean PlaindromeCheck(String str) {
        int st=0,end=str.length()-1;
        while(st<end){
            if(str.charAt(st)!=str.charAt(end)){
                
                return false;
            }
            st++;
            end--;  
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean isPalindrome = PlaindromeCheck(str);

        System.out.println(isPalindrome ? "The string is a palindrome." : "The string is not a palindrome.");
    }
    
}