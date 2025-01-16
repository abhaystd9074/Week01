import java.util.Scanner;

public class CountSubstring {

   public static int countSubstring(String str, String subStr) {
        int count = 0;
        int lenOfSubstr=subStr.length();
        for (int i = 0; i <=str.length()-lenOfSubstr; i++) {
             String temp=str.substring(i,i+lenOfSubstr);
             if(temp.equals(subStr)){
                 count++;
             }
            
        }
        return count;
    }
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print("Enter a substring: ");
    String subStr = sc.nextLine();
    int count = countSubstring(str, subStr);
    System.out.println("count of substring is " + count);   
    
    }
    
}
