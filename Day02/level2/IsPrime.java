 import java.util.*;
  public class IsPrime{ 
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	// if number is dicisible by only 1 and itself then it is prime otherwise not prime
	 boolean isprime=true;
	    for(int i=2;i<num;i++){
		 if(num%i == 0){
		 isprime=false;
		 break;}
		}
		if(isprime)
		  System.out.println(" entered number is prime ");
		  else
		  System.out.println(" entered number is not  prime ");

  }
 }
 