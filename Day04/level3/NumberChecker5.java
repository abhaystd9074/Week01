public class NumberChecker5 {

    
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];  // the size of the factorial array is same as no. of factors.
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        int greatest = 0;
        for (int factor : factors) {
            if (factor > greatest) greatest = factor;
        }
        return greatest;
    }

    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num, int sumOfFactors) {
        return sumOfFactors - num == num;
    }

    public static boolean isAbundantNumber(int num, int sumOfFactors) {
        return sumOfFactors - num > num;
    }

    public static boolean isDeficientNumber(int num, int sumOfFactors) {
        return sumOfFactors - num < num;
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit); // factorial of all digits 
            temp /= 10;
        }
        return sum == num;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        
		Scanner sc=new Scanner (System.in);
		 int number=sc.nextInt();
        int[] factors = findFactors(number);
        int greatestFactor = findGreatestFactor(factors);
        int sumOfFactors = findSumOfFactors(factors);
        int productOfFactors = findProductOfFactors(factors);
        double productOfCubeOfFactors = findProductOfCubeOfFactors(factors);
        boolean isPerfect = isPerfectNumber(number, sumOfFactors);
        boolean isAbundant = isAbundantNumber(number, sumOfFactors);
        boolean isDeficient = isDeficientNumber(number, sumOfFactors);
        boolean isStrong = isStrongNumber(number);

        System.out.println("Number: " + number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Greatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumOfFactors);
        System.out.println("Product of Factors: " + productOfFactors);
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors);
        System.out.println("Is Perfect: " + isPerfect);
        System.out.println("Is Abundant: " + isAbundant);
        System.out.println("Is Deficient: " + isDeficient);
        System.out.println("Is Strong: " + isStrong);
    }

}