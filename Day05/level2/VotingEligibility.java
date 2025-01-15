import java.util.*;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Can not Vote";
            }
        }
        return result;
    }

    public static void displayResult(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] eligibility = checkVotingEligibility(ages);

        displayResult(eligibility);
    }
}
