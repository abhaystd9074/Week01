import java.util.*;
public class CanVote{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int age=sc.nextInt();
 
 String ans="No";
 // if hte age is equal to or greater than 18 then he can bote
 if(age >= 18)
  ans="True";
  
 
 if(ans == "True")
  System.out.println("The person's age is " + age +" and can vote.");
   else 
  System.out.println("The person's age is " + age +" and cannot vote.");

}
}