import java.util.Scanner;

public class OddEvenArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println(" enter a natural number greater than 0.");
            
        }
		else{

        int[] oddarr = new int[number / 2 + 1];
        int[] evenarr = new int[number / 2 + 1];
        int ind1 = 0;
        int ind2 = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenarr[ind2] = i;
                ind2++;
            } else {
                oddarr[ind1] = i;
                ind1++;
            }
        }

        System.out.println("Odd numbers");
        for (int i = 0; i < ind1; i++) {
            System.out.print(oddarr[i] + " ");
        }

        System.out.println("\nEven numbers");
        for (int i = 0; i < ind2; i++) {
            System.out.print(evenarr[i] + " ");
        }
		}
    }
}
