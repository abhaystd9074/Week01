import java.util.Scanner;

public class BMI2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons ");
        int numPersons = sc.nextInt();
        double[][] personData = new double[numPersons][3];  
        String[] weightStatus = new String[numPersons];     
        // Taking input for weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Get weight input
            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();

            // Get height input
            System.out.print("Enter height (m): ");
            double height = sc.nextDouble();

            // Store the weight and height in the personData array
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            personData[i][2] = weight / (height * height);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        // Display results
        System.out.println("\nBMI and Weight Status of Persons ");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
