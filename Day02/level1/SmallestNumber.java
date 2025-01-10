import java.util.*;
public class SmallestNumber{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num1=sc.nextInt();
 int num2=sc.nextInt();
 int num3=sc.nextInt();
 String ans="Yes";
 // checking for the smallest number
 if(num1 < num2  && num1<num3)
 ans="Yes";

else ans="No";

System.out.println(" Is the first number the smallest? "+ans);
}
}