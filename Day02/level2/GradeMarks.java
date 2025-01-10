 import java.util.*;
  public class GradeMarks{ 
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter marks of physics");
	int physics=sc.nextInt();
	
	System.out.println("enter marks of chemistry");
	int chemistry=sc.nextInt();
	
	System.out.println("enter marks of maths");
	int maths=sc.nextInt();
	
	 double marks = ((physics+chemistry+maths) *100.0)/300.0;
	 
	 // here i am calculating the grade 
	 if(marks >=80) 
	 System.out.println(" grade is A and remark is =  Level 4, above agency-normalized standards");
	 else if (marks>=70 && marks<80)
       	 System.out.println(" grade is B and remark is = Level 3, at agency-normalized standards");
         
          else if (marks>=60 && marks<70)
       	    System.out.println(" grade is C and remark is = Level 2, below, but approaching agency-normalized standards");
           else if (marks>=50 && marks<60)
       	      System.out.println("  grade is D and remark is = Level 1-, well below agency-normalized standards");
			  else if(marks>=40 && marks<50)
			       System.out.println(" grade is E and remark is =  Level 1-, too below agency-normalized standards");
               else
			      System.out.println(" grade is R and remark is = Remedial standards");

			    

	  
	
    }
 }
 