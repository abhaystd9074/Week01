import java.util.Random;

public class Score {
     public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics (40-100)
            scores[i][1] = 40 + random.nextInt(61); // Chemistry (40-100)
            scores[i][2] = 40 + random.nextInt(61); // Math (40-100)
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // [Total, Average, Percentage]

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 digits
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 digits
        }
        return results;
    }

    public static String determineGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "F";
    }

    public static String determineRemark(double percentage) {
        if (percentage >= 80) return "Above agency-normalized standards";
        else if (percentage >= 70) return "At agency-normalized standards";
        else if (percentage >= 60) return "Approaching agency-normalized standards";
        else if (percentage >= 50) return "Well below agency-normalized standards";
        else if (percentage >= 40) return "Too below agency-normalized standards";
        else return "Remedial standards";
    }
    public static void main(String[] args) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade\tRemark");

        int numStudents = 10; // You can set the number of students as needed
        int[][] pcmScores = generateScores(numStudents); // Generate PCM scores
        double[][] results = calculateResults(pcmScores); // Calculate total, average, and percentage

        for (int i = 0; i < pcmScores.length; i++) {
            int physics = pcmScores[i][0];
            int chemistry = pcmScores[i][1];
            int math = pcmScores[i][2];
            double total = results[i][0];
            double average = results[i][1];
            double percentage = results[i][2];

            String grade = determineGrade(percentage);
            String remark = determineRemark(percentage);

            System.out.println((i + 1) + "\t" + physics + "\t" + chemistry + "\t\t" + math + "\t" +
                    total + "\t" + average + "\t" + percentage + "\t\t" + grade + "\t" + remark);
        }
    }

   
}