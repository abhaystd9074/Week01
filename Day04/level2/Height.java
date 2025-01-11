import java.util.*;

public class Height {

    public static String findYoungest(int[] ages) {
        int ansIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[ansIndex]) {
                ansIndex = i;
            }
        }
        if (ansIndex == 0) {
            return "Amar";
        } else if (ansIndex == 1) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public static String findTallest(double[] heights) {
        int ansIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[ansIndex]) {
                ansIndex = i;
            }
        }
        if (ansIndex == 0) {
            return "Amar";
        } else if (ansIndex == 1) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
       
        System.out.print("Enter the height and age of Amar  ");
        heights[0] = sc.nextDouble();
		 ages[0] = sc.nextInt();

        System.out.print("Enter the height and age of Akbar  ");
        heights[1] = sc.nextDouble();
		ages[1] = sc.nextInt();

         System.out.print("Enter the height and age of Anthony  ");
        heights[2] = sc.nextDouble();
		ages[2] = sc.nextInt();

        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);

        System.out.println(youngest + " is the youngest");
        System.out.println(tallest + " is the tallest");

     
    }
}
