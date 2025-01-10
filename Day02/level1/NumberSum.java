import java.util.*;
public class NumberSum{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num=sc.nextInt();
 
 String ans="No";
 
 if(num > 0)
  ans="True";
   int n=num;
    // finding sum by using loop
 int sum = (num*(num+1))/2;
 int sum1=0;
 // finding sum by using loop
 while(num>=1){
 sum1+=num;
 num--;}
 
 if(ans == "True"){
 if(sum1 == sum) 
   System.out.println("The sum of " + n + " natural numbers is " + sum);

 }
 
   else 
     System.out.println("The number " + n + " is not a natural number");

}
}