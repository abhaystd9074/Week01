import java.util.Scanner;

public class Grades2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[3];
        double percentage;
        char grade;
        System.out.println("Enter marks for the student");

        // Loop to take input for 3 subjects
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            if (marks[i] < 0) {
                marks[i] = 0; // Set negative marks to 0
            }
        }

        // Calculate percentage
        percentage = (marks[0] + marks[1] + marks[2]) / 3.0;
        // Determine grade based on percentage
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'R';
        }

        // Output the grade for the student
        System.out.println("The grade for the student is" + grade);
    }
}
