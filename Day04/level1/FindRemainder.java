import java.util.*;

public class FindRemainder {
    public static int[] findRemainderAndQuotient(int number,int divisor) {
	 
	 int arr[]=new int [2];
	 arr[0]=number/divisor;
	 arr[1]=number%divisor;
       return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number ");
        int number = sc.nextInt();
		
		System.out.println("Enter divisor ");
        int divisor = sc.nextInt();
		
        int arr[]=findRemainderAndQuotient(number,divisor);
        
        System.out.println(" Smallest number is  = "+arr[0] );
		System.out.println(" Largest number is  = "+arr[1] );
    }
}
