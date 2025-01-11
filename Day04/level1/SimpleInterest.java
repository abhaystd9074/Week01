import java.util.*;
public class SimpleInterest{

    public static double SI(int p,int r,int t){
	    double res=(p*r*t*1.0)/100;
		return res;
	}

  public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.println(" enter the principal amount" );
	int p=sc.nextInt();
	
	System.out.println(" enter the rate" );
	int r=sc.nextInt();
	
    System.out.println(" enter the time frame" );
	int t=sc.nextInt();
	System.out.println("The Simple Interest is " + SI(p,r,t) +" for Principal "+ p+" Rate of Interest "+r +" and Time "+t);
	
    }
}