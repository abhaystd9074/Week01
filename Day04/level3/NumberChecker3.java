import java.util.*;

public class NumberChecker3 {

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

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeNumber(int[] digits, int[] reversedDigits) {
        return compareArrays(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        int number = 12321;

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        boolean areArraysEqual = compareArrays(digits, reversedDigits);
        boolean isPalindrome = isPalindromeNumber(digits, reversedDigits);
        boolean isDuck = isDuckNumber(digits);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));
        System.out.println("Are arrays equal: " + areArraysEqual);
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
    }

    
}