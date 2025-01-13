import java.util.Scanner;

public class ArrayIndexOutOfBoundsException8 {

    public static void generateException(int[] arr) {
        System.out.println(arr[arr.length]);
    }

    public static void handleException(int[] arr) {
        try {
           
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" ArrayIndexOutOfBoundsException handeled " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(" RuntimeException handeled " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            generateException(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception  in main: " + e.getMessage());
        }

        handleException(arr);
    }
}
