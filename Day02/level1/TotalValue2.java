import java.util.*;
public class TotalValue2{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
 int num=sc.nextInt();
   double ans=0;
   while(true){
   ans+=num;
   num=sc.nextInt();
   if(num!=0 && num >0) break;
   }
   System.out.println("Total vlue " + ans);
 
}
}