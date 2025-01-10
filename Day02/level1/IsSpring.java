import java.util.*;
public class IsSpring{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int month=sc.nextInt();
  int day=sc.nextInt();
 String ans="No";
 
 if(month ==3 && day>=20)
   ans="Yes";
   else if(month > 3 && month <6) ans="Yes";
   else if(month == 6 && day<=20) ans="Yes";
 
 if(ans =="Yes") 
   System.out.println("Spring Session");
   else System.out.println(" Not a Spring Session");
  
}
}