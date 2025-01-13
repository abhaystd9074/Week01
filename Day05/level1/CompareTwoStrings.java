import java.util.*;
public class CompareTwoStrings {
    public static boolean Compare(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
    for(int i=0;i<s1.length();i++){
       if(s1.charAt(i) != s2.charAt(i)) return false;
    }
    return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a first string : ");
         String str1=sc.next();
         System.out.print("enter a second string : ");
         String str2=sc.next();
         System.out.println();
        boolean ans1=Compare(str1,str2);
        boolean ans2=str1.equals(str2);
        System.out.println("comparision of .equals method and using chatAt method is " + ((ans1==ans2)?"Same":"not Same" )+ " and ans is "+ans1);

         sc.close();

    }
    
}
