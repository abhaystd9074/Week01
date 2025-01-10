import java.util.Scanner;

public class Factor2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number ");
int number = sc.nextInt();
int greatestFactor = 1;
for (int i = 1; i <=number; i++) {
if (number % i == 0) {
System.out.println(i);

}
}

}
}
