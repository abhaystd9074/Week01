import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100. I will guess it.");
        while (!found) {
            int guess = rnd.nextInt(high - low + 1) + low;
            System.out.println("Is it " + guess + "? (high/low/correct): ");
            String fb = sc.nextLine();

            if (fb.equals("high")) {
                high = guess - 1;
            } else if (fb.equals("low")) {
                low = guess + 1;
            } else if (fb.equals("correct")) {
                System.out.println("I guessed it!");
                found = true;
            }

            if (low > high) {
                System.out.println("Your feedback is inconsistent. Restart the game!");
                break;
            }
        }
        sc.close();
    }
}
