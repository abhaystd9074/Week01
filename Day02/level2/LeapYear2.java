 import java.util.*;
  public class LeapYear2{ 
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	
	// it checking for century year as well as non century year
	if((year%100 ==0  && year%400 ==0) || (year%100 !=0  && year%4==0)){
	  System.out.println("It is a leap Year");
	  }
	  
	else{
		  System.out.println("It is not a leap Year");
    }
 }
 }