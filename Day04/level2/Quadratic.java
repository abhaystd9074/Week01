
import java.util.*;

public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			double []ans=new double[2];
                 ans[0]=root1;
				 ans[1]=root2;
				 return ans;
        } else if (delta == 0) {
            double root = -b / (2 * a);
			double []ans=new double[1];
                 ans[0]=root;
				 return ans;
            
        } else {
            double []ans=new double[0];
			return ans;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients a, b, and c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            for (int i = 0; i < roots.length; i++) {
                System.out.println("Root " + (i + 1) + ": " + roots[i]);
            }
        }
    }
}
