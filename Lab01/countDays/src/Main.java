// Dinh Viet Ha 20215042
// Ex 6.4

import java.util.Scanner;
public class Main {
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Month: ");
        int month = 0;
        while (month > 12 || month < 1) { // Force user to enter a valid month
            month = scanner.nextInt();
        }

        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.close();
        System.out.println("Number of days: " + getDaysInMonth(month, year));
    }
}
