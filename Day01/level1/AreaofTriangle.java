import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

         System.out.print("Enter the base of the triangle ");
        double base = sc.nextDouble();
        
        System.out.print("Enter the height of the triangle ");
        double height = sc.nextDouble();

        // Calculate the area of the triangle
        double area = (1.0 / 2) * base * height;

        // Display the result
        System.out.println("Area of the Triangle is = " + area);
    }
}

