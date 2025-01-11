

import java.util.*;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int num1,int num2,int num3) {
	 int mini=Math.min(num1,Math.min(num2,num3));
	 int maxi=Math.max(num1,Math.max(num2,num3));
	 int []arr= new int[2];
      arr[0]=mini;
      arr[1]=maxi;	  
	  return arr;
	 
       
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number ");
        int n1 = sc.nextInt();
		
		System.out.println("Enter a second number ");
        int n2 = sc.nextInt();
		
		System.out.println("Enter a third number ");
        int n3 = sc.nextInt();
        int arr[]=findSmallestAndLargest(n1,n2,n3);
        
        System.out.println(" Smallest number is  = "+arr[0] );
		System.out.println(" Largest number is  = "+arr[1] );
    }
}



