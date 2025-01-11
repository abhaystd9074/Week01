import java.util.*;

public class SpringSession {
    public static Boolean check(int month, int day) {
        String ans = "No";

        if (month == 3 && day >= 20) ans = "Yes";
        else if (month > 3 && month < 6) ans = "Yes";
        else if (month == 6 && day <= 20) ans = "Yes";

        if (ans == "Yes") return true;
        else return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number:");
        int day = sc.nextInt();

        System.out.println("Enter month number:");
        int month = sc.nextInt();

        Boolean ans = check(month, day);
        if (ans) 
            System.out.println("Spring Session");
        else 
            System.out.println("Not Spring Session");
    }
}
