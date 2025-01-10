import java.util.*;
public class OddEven{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num=sc.nextInt();
   
   
    for( int i=1;i<=num;i++){
	  if(i%2 == 0)
	    System.out.println("number " + i +" is  Even");
		else
		 System.out.println("number " + i +" is  Odd");

	}


}
}