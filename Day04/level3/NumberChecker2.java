import java.util.Arrays;

public class NumberChecker2 {


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

    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int findSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num, int sumOfDigits) {
        return num % sumOfDigits == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {   
        int []freq=new int[10];
        for(int digit=0;digit<digits.length;digit++) 
        {
           freq[digits[digit]]++; // eg. digits[digit]=7 so go on freq[7]and ++;
        }

        int uniqueCount = 0;
        for (int count : freq) {
            if (count > 0) uniqueCount++;
        }

        int[][] frequencyArray = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                frequencyArray[index][0] = i;
                frequencyArray[index][1] = freq[i];
                index++;
            }
        }
        return frequencyArray;
    }


   public static void main(String[] args) {
        int number = 1729;

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        int sumOfDigits = findSumOfDigits(digits);
        int sumOfSquares = findSumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        int[][] digitFrequency = findDigitFrequency(digits);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit frequency:");
        for (int[] freq : digitFrequency) {
            System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
        }
    }
	}

