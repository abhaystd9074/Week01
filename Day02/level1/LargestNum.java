import java.util.*;
public class LargestNum{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num1=sc.nextInt();
 int num2=sc.nextInt();
 int num3=sc.nextInt();
 String ans1="No";
 String ans2="No";
 String ans3="No";
 // checking for first number
 if(num1 > num2  && num1>num3)
  ans1="True";

 // checking for Second number  
 if(num2 > num1  && num2>num3)
  ans2="True";

   // checking for Third number  
 if(num3 > num1  && num3>num2)
  ans3="True";

System.out.println(" Is the first number the smallest? "+ans1);
System.out.println(" Is the Second number the smallest? "+ans2);
System.out.println(" Is the Third number the smallest? "+ans3);

}
}