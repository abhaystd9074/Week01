import java.util.Arrays;

public class NumberChecker1 {

   
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);  
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';  
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;    

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;  
                largest = digit;         
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};   
    }

    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit > smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }


    public static void main(String[] args) {
        int number = 153;

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        boolean isDuck = isDuckNumber(digits);
        boolean isArmstrong = isArmstrongNumber(number, digits);
        int[] largestTwo = findLargestTwo(digits);
        int[] smallestTwo = findSmallestTwo(digits);

        System.out.println("Number " + number);
        System.out.println("Count of digits " + digitCount);
        System.out.println("Digits array " + Arrays.toString(digits));
        System.out.println("Is Duck Number " + isDuck);
        System.out.println("Is Armstrong Number " + isArmstrong);
        System.out.println("Largest digit " + largestTwo[0]);
        System.out.println("Second largest digit " + largestTwo[1]);
        System.out.println("Smallest digit " + smallestTwo[0]);
        System.out.println("Second smallest digit " + smallestTwo[1]);
    }
}