import java.util.*;

public class BMI {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;  
        }
    }

    public static String[] BMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);

        String[] bmiStatus = BMIStatus(data);

        System.out.println("\nPerson\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + data[i][2] + "\t\t" + bmiStatus[i]);
        }

        sc.close();
    }
}
