import java.util.*;

public class TrigonometricFunctions {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
		 double ans []= new double[3];
		 ans[0]=sine;
		 ans[1]=cosine;
		 ans[2]=tangent;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle in degrees");
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine of angle is " + results[0]);
        System.out.println("Cosine of angle is " + results[1]);
        System.out.println("Tangent of angle is " + results[2]);
      
    }
}
