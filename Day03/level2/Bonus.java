import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        int employeeCount = 0;

        while (employeeCount < 10) {
            System.out.print("Enter salary for employee " + (employeeCount + 1) + ": ");
            double currentSalary = scanner.nextDouble();
            
            if (currentSalary <= 0) {
                System.out.println("Invalid salary");
                continue;
            }
            salary[employeeCount] = currentSalary;
            
            System.out.print("Enter years of service for employee " + (employeeCount + 1) );
            double currentYearsOfService = scanner.nextDouble();
            
            if (currentYearsOfService < 0) {
                System.out.println("Invalid years of service");
                continue;
            }
            yearsOfService[employeeCount] = currentYearsOfService;
            
            employeeCount++;
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary of all employees " + totalOldSalary);
        System.out.println("Total new salary of all employees " + totalNewSalary);
    }
}
