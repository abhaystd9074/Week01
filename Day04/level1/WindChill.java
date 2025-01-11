import java.util.*;

public class WindChill {
    public static double calculateWindChill(double temp,double speed) {
	 
       double ans=35.74+(0.6125*temp)+((0.4275*temp - 35.75)*(Math.pow(speed,0.16)));
	   return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature  ");
        double temp  = sc.nextInt();
		
		System.out.println("Enter speed of wind ");
        double speed = sc.nextInt();
		
       double res=calculateWindChill(temp,speed);
        
        System.out.println(" wind chill is = "+res );
    }
}
