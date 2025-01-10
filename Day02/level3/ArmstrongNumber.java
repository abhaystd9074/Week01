import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number ");
int number = sc.nextInt();
int num = number;
int sum = 0;
while (num != 0) {
int remainder = num % 10;
sum += remainder * remainder * remainder;
num /= 10;
}
if (sum == number) {
System.out.println(number + " is an Armstrong number");
} else {
System.out.println(number + " is not an Armstrong number");
}
}
}
