import java.util.*;
public class TotalValue{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num=sc.nextInt();
   double ans=0;
   // it will take input until user enter 0
   while(num !=0){
   ans+=num;
   num=sc.nextInt();
   }
   System.out.println("Total vlue " + ans);
   

 
 
}
}