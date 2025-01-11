public class NumberChecker4 {


     public static boolean isPrimeNumber(int num) {
        if (num <= 1) return false; 
        for (int i = 2; i < num; i++) { 
            if (num % i == 0) return false; 
        }
        return true;
    }

    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == num;
    }

    public static boolean isSpyNumber(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr); 
    }

    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 25;

        boolean isPrime = isPrimeNumber(number);
        boolean isNeon = isNeonNumber(number);
        boolean isSpy = isSpyNumber(number);
        boolean isAutomorphic = isAutomorphicNumber(number);
        boolean isBuzz = isBuzzNumber(number);

        System.out.println("Number: " + number);
        System.out.println("Is Prime: " + isPrime);
        System.out.println("Is Neon: " + isNeon);
        System.out.println("Is Spy: " + isSpy);
        System.out.println("Is Automorphic: " + isAutomorphic);
        System.out.println("Is Buzz: " + isBuzz);
    }

   
}