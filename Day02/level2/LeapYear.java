 import java.util.*;
  public class LeapYear{ 
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	
	// it checking for century year
	if(year%100 ==0){
	 if(year%400 == 0){
	  System.out.println("It is a leap Year");}
	  else System.out.println("It is not a leap Year");
	  }
	  // it is checkig for non century year
	else{
	     if(year%4==0){
	  	   System.out.println("It is a leap Year");
		  }
		  else System.out.println("It is not a leap Year");
    }
 }
 }