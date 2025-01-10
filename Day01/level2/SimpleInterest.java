import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the principal  ");
        double principal = scanner.nextDouble();

        System.out.print("enter the Rate  ");
        double rate = scanner.nextDouble();

        System.out.print("enter the Time  ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + "%" +", and Time " + time + " years.");

       
    }
}
