import java.util.*;
public class CheckNumber{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num=sc.nextInt();
 
 String ans="No";
 
 if(num < 0)
   System.out.println("Negative");
  else if(num == 0)
   System.out.println("Zero");
  else if(num > 0)
   System.out.println("Positive");

}
}