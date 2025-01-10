import java.util.*;
public class Divide{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int n=sc.nextInt();
 String ans="Yes";
 // checking the number is divisible by 5 or not
 if(n%5 == 0)
 ans="Yes";

else ans="No";
System.out.println("Is the number "+n+" divisible by 5 ?  "+ans);
}
}