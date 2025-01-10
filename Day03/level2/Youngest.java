import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.print("Enter age of Amar ");
        ages[0] = sc.nextInt();
        System.out.print("Enter height of Amar ");
        heights[0] = sc.nextDouble();

        System.out.print("Enter age of Akbar ");
        ages[1] = sc.nextInt();
        System.out.print("Enter height of Akbar ");
        heights[1] = sc.nextDouble();

        System.out.print("Enter age of Anthony ");
        ages[2] = sc.nextInt();
        System.out.print("Enter height of Anthony ");
        heights[2] = sc.nextDouble();

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        String youngest = "";
        String tallest = "";

        if (youngestIndex == 0) {
            youngest = "Amar";
        } else if (youngestIndex == 1) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        if (tallestIndex == 0) {
            tallest = "Amar";
        } else if (tallestIndex == 1) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);
    }
}
