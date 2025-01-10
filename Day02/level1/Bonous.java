import java.util.*;
public class Bonous{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int salary=sc.nextInt();
  int years=sc.nextInt();
// if years are greater than 5 
   int bonous = (salary*5)/100;
    if(years >5){
	System.out.println("the bonous amount is " + bonous);
	}
	else{
	System.out.println("years are less then 5 " );

	}


}
}