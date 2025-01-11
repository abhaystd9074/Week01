import java.util.*;

public class ChocletDistribution {
    public static int[] findRemainderAndQuotient(int number,int divisor) {
	 
	 int arr[]=new int [2];
	 arr[0]=number/divisor;
	 arr[1]=number%divisor;
       return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number Of chocolates  ");
        int numberOfchocolates  = sc.nextInt();
		
		System.out.println("Enter number Of Children ");
        int numberOfChildren = sc.nextInt();
		
        int arr[]=findRemainderAndQuotient(numberOfchocolates,numberOfChildren);
        
        System.out.println(" equally distributed chocklets are  = "+arr[0] );
		System.out.println(" remaining chocklets are  = "+arr[1] );
    }
}
