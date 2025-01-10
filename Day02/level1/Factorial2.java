import java.util.*;
public class Factorial2{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num=sc.nextInt();
   int ans=1;
   // calculating the factorial using loop
    for( int i=1;i<=num;i++){
	ans*=i;}

     System.out.println("The  factorial of number " + num + " is "+ans);

}
}