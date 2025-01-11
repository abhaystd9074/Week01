import java.util.*;
public class Park{
    public static double rounds(int a,int b,int c){
     double perimeter = a+b+c;
     double rounds = 5000.0/perimeter ;
     return rounds;
    } 
  public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.println(" enter  first side in m" );
	int side1=sc.nextInt();
	
	System.out.println(" enter  second side in m" );
	int side2=sc.nextInt();
	
	System.out.println(" enter  third side in m" );
	int side3=sc.nextInt();
	 double res=rounds(side1,side2,side3);
	
	System.out.println("number of rounds are " + res );
	
    }
}