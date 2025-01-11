import java.util.*;

class FactorsProgram {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int i=0;i<factors.length;i++) sum+= factors[i];
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int i=0;i<factors.length;i++) product *= factors[i];
        return product;
    }

    public static double sumSquareFactors(int[] factors) {
        double sumSquare = 0;
        for (int i=0;i<factors.length;i++) sumSquare += Math.pow(factors[i], 2);
        return sumSquare;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number =  ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
		        System.out.println(" factors are =");

        for(int i=0;i<factors.length;i++){
		        System.out.print(factors[i] + " ");
		}
	    System.out.println();

        System.out.println("Sum of factors  is " + sumFactors(factors));
        System.out.println("Product of factors is " + productFactors(factors));
        System.out.println("Sum of square of factors is " + sumSquareFactors(factors));
    }
}
