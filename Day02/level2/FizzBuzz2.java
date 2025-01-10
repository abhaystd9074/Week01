 import java.util.*;
  public class FizzBuzz2{ 
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	 int i=0;
	 while(i<=num){
	    if(i%3 ==0 && i%5!=0) 	System.out.println(i + " Fizz");
		else if(i%3 !=0 && i%5==0) 	System.out.println(i + " Buzz");
        else if(i%3 ==0 && i%5==0) 	System.out.println(i + " FizzBuzz"); 
		i++;
	 }
  }
 }
 