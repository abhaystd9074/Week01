import java.util.*;

public class TotalSum {
    public static int sum(int n) {
        int sum=0;
		while(n-->0){
		sum+=n;}
		return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int n = sc.nextInt();

        int res=sum(n);
        System.out.println(" the sum of n natural numbers = "+res);
    }
}
