import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number: ");
double first = sc.nextDouble();
System.out.print("Enter the second number: ");
double second = sc.nextDouble();
System.out.print("Enter an operator (+, -, *, /): ");
String op = sc.next();

switch (op) {
case "+":
System.out.println("Result " + (first + second));
break;
case "-":
System.out.println("Result " + (first - second));
break;
case "*":
System.out.println("Result " + (first * second));
break;
case "/":
System.out.println("Result " + (first / second));
break;
default:
System.out.println("Invalid Operator.");
}

}
}
