import java.util.Scanner;

public class Calendar {

    private static final String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public static String getMonthName(int month) {
        return monthNames[month - 1];
    }

    public static int getFirstDayOfMonth(int year, int month) {
        int q = 1;
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (q + ((13 * (month + 1)) / 5) + k + (k / 4) + (j / 4) - (2 * j)) % 7;
        return h;
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("          " + getMonthName(month) + " " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        int daysInThisMonth = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(year, month);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        for (int day = 1; day <= daysInThisMonth; day++) {
            System.out.printf("%3d   ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);
    }
}