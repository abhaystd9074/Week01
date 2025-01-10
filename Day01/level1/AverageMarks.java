public class AverageMarks {
    public static void main(String[] args) {
        // Marks in three subjects
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate the average
        double average = (maths + physics + chemistry) / 3.0;

        // Print the result
        System.out.printf("Sam's average mark in PCM is %.2f", average);
    }
}