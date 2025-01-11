import java.util.*;
public class HandShakes{

    public static double Combination(int n){
	    double res=(n*(n-1))/2;
		return res;
	}

  public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.println(" enter  number of students" );
	int numberOfStudents=sc.nextInt();
	
	
	System.out.println("The possible no. of handshakes can be " + Combination(numberOfStudents) );
	
    }
}