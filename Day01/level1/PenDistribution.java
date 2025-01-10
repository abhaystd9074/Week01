public class PenDistribution {
    public static void main(String[] args) {
       
        int pens = 14;
        int students = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = pens / students;
        int remainingPens = pens % students;

        // Print the results
        System.out.println("The pens per student is " + pensPerStudent +
                           " and the remaining pens not distributed is " + remainingPens);
    }
}

