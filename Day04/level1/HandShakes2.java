import java.util.*;
public class HandShakes2{
  public static void main(String args[])
    {
	Scanner sc=new Scanner (System.in);
	System.out.println(" enter  number of students" );
	int numberOfStudents=sc.nextInt();
	 double res=(numberOfStudents*(numberOfStudents-1))/2;
	
	System.out.println("The possible no. of handshakes can be " + res );
	
    }
}