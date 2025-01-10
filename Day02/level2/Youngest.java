import java.util.Scanner;

public class Youngest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the age of Amar ");
int ageAmar = sc.nextInt();
System.out.print("Enter the height of Amar ");
int heightAmar = sc.nextInt();
System.out.print("Enter the age of Akbar ");
int ageAkbar = sc.nextInt();
System.out.print("Enter the height of Akbar ");
int heightAkbar = sc.nextInt();
System.out.print("Enter the age of Anthony ");
int ageAnthony = sc.nextInt();
System.out.print("Enter the height of Anthony ");
int heightAnthony = sc.nextInt();

int youngestAge = ageAmar;
String ans1="Amar";
if (ageAkbar < youngestAge){ youngestAge = ageAkbar; ans1="Akbar";} 
if (ageAnthony < youngestAge) {youngestAge = ageAnthony; ans1="Anthony";}
String ans2="Amar";
int tallestHeight = heightAmar;
if (heightAkbar > tallestHeight){ tallestHeight = heightAkbar; ans2="Akbar";}
if (heightAnthony > tallestHeight) {tallestHeight = heightAnthony; ans2="Anthony";}

System.out.println("The youngest friend is  " + ans1);
System.out.println("The tallest friend is  " + ans2);
}
}
