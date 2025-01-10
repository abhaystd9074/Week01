import java.util.*;
public class Factorial{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num=sc.nextInt();
   int ans=1;
   // calculating the factorial using loop
    while(num>1){
	  ans*=num;
	  num--;
	  }

     System.out.println("The  factorial of number " + num + " is "+ans);

}
}