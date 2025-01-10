 import java.util.*;
  public class FizzBuzz{ 
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	
	 for(int i=0;i<=num;i++){
	    if(i%3 ==0 && i%5!=0) 	System.out.println(i + " Fizz");
		else if(i%3 !=0 && i%5==0) 	System.out.println(i + " Buzz");
        else if(i%3 ==0 && i%5==0) 	System.out.println(i + " FizzBuzz"); 
	 }
  }
 }
 