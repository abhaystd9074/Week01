import java.util.Scanner;

public class FindSubsring {
    public static String find(String s,int st,int end){
        String ans="";
        for(int i=st;i<end;i++){
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a string : ");
        String s=sc.next();
        System.out.println("enter the first index :");
        int  a=sc.nextInt();
        System.out.println("enter the end index :");
        int b=sc.nextInt();

        String ans1=find(s,a,b);
        String ans2=s.substring(a,b);
        System.out.println("comparision of two methods ?  " +((ans1.equals(ans2))?"Same ":"not same  ")+ "and ans is" +ans1);


    }
}
