import java.util.Random;

public class EmployeeBonus {

    public static int[][] initEmp(int n) {
        int[][] emp = new int[n][2];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            emp[i][0] = 30000 + rand.nextInt(70000);
            emp[i][1] = rand.nextInt(11);
        }

        return emp;
    }

    public static double[][] calcBonusAndNewSal(int[][] emp) {
        double[][] updatedEmp = new double[emp.length][2];

        for (int i = 0; i < emp.length; i++) {
            int sal = emp[i][0];
            int yrs = emp[i][1];
            double bonusPerc = yrs > 5 ? 0.05 : 0.02;
            double bonus = sal * bonusPerc;
            double newSal = sal + bonus;

            updatedEmp[i][0] = newSal;
            updatedEmp[i][1] = bonus;
        }

        return updatedEmp;
    }

    public static void displaySummary(int[][] emp, double[][] updatedEmp) {
        double totalOldSal = 0;
        double totalNewSal = 0;
        double totalBonus = 0;

        System.out.printf("%5s %10s %15s %15s %15s\n", "ID", "Old Sal", "Yrs of Service", "New Sal", "Bonus");

        for (int i = 0; i < emp.length; i++) {
            int oldSal = emp[i][0];
            int yrs = emp[i][1];
            double newSal = updatedEmp[i][0];
            double bonus = updatedEmp[i][1];

            totalOldSal += oldSal;
            totalNewSal += newSal;
            totalBonus += bonus;

            System.out.printf("%5d %10d %15d %15.2f %15.2f\n", i + 1, oldSal, yrs, newSal, bonus);
        }

        System.out.printf("%5s %10.2f %15s %15.2f %15.2f\n", "TOTAL", totalOldSal, "", totalNewSal, totalBonus);
    }

    public static void main(String[] args) {
        int n = 10;

        int[][] emp = initEmp(n);
        double[][] updatedEmp = calcBonusAndNewSal(emp);
        displaySummary(emp, updatedEmp);
    }
}