import java.util.*;
public class LongestWorld{
    public static String findLongestWord(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            int j=i;String temp="";
            while(j<s.length()  && s.charAt(j)!=' '){
               temp+=s.charAt(j);
               j++;
            }
            if(temp.length()> ans.length())
                ans=temp;
               i=j;
            
        }
      return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a sentance : ");
        String s =sc.nextLine();
        System.out.println("longest word is "+findLongestWord(s));

    }
}