import java.util.*;
public class Geometry {

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 - x1 == 0) {
            // if x1 == x2,  line is vertical, and slope is not visible
            return null;
        }
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }


    public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter x1");
        double x1=sc.nextDouble();
			System.out.println("Enter y1");
		double y1=sc.nextDouble();
			System.out.println("Enter x2");
		double x2=sc.nextDouble();
			System.out.println("Enter y2");
		double y2=sc.nextDouble();
        

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        if (lineEquation != null) {
            System.out.println("Equation of the line: y = " + lineEquation[0] + "*x + " + lineEquation[1]);
        } else {
            System.out.println("The points form a vertical line; equation is x = " + x1);
        }
    }

    
}