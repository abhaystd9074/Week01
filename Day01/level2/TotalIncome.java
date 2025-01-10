import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your salary  ");
        double salary = scanner.nextDouble();

        System.out.print("enter your bonus in  ");
        double bonus = scanner.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +" Hence Total Income is INR " + totalIncome);

}
}     
