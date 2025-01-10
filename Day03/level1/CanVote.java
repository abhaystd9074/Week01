import java.util.Scanner;
public class CanVote {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] ages = new int[10];
    for(int i=0;i<10;i++) {ages[i]=scanner.nextInt();}
    for(int i=0;i<10;i++) {
    if(ages[i]<0) System.out.println("Invalid age");
    else if(ages[i]>=18) 
    System.out.println("The student with the age " + ages[i] + " can vote");
    else
   System.out.println("The student with the age " + ages[i] + " cannot vote");
}
}  
}
