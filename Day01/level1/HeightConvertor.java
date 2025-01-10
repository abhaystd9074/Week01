import java.util.Scanner;
     public class HeightConvertor {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

             System.out.print("Enter your height in centimeters ");
        int heightInCm = sc.nextInt();

        // Convert height from centimeters to inches
        double heightInInch = (heightInCm / 2.54);

        // Convert height from inches to feet
        double heightInFoot = (heightInInch / 12);

        // Display the height in centimeters, feet, and inches
        System.out.printf("Your height in cm is %d while in feet is %.1f and inches is %.1f", heightInCm, heightInFoot, heightInInch);
    }
}

