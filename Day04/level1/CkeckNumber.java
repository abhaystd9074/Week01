import java.util.*;
public class CkeckNumber{
    public static int check(int a){
    if(a<0) return -1;
    if(a==0) return 0;
	  return 1;
    } 
  public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.println(" enter  a number to check" );
	int n=sc.nextInt();
	System.out.println(" entered number is  " + check(n));
	
    }
}