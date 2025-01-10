import java.util.*;
public class NaturalNumber{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num=sc.nextInt();
 
 String ans="No";
 
 if(num > 0)
  ans="True";
  // calculating the sum from 1 to n
 int sum = (num*(num+1))/2;
 if(ans == "True")
  System.out.println("The sum of " + num + " natural numbers is " + sum);
   else 
     System.out.println("The number " + num + " is not a natural number");

}
}