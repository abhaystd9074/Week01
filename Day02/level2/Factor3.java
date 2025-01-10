import java.util.Scanner;

public class Factor3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = sc.nextInt();
for (int i = 100; i >= 1; i--) {
if (i % number == 0) {
System.out.println(i);
}
}
sc.close();
}
}
