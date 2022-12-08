// 09-19-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        boolean leap = false;
        int daysInMonth = 0;
        System.out.println("\nThis program will tell you how many days are in a given month.\n"+
            "We will assume the Proleptic Gregorian Calendar starting in year 1583 CE.");
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich year would you like to check? ");
        int year = input.nextInt();
        while (year <= 1582) {
            System.out.print("\n" + year + " is not a valid year for this program. Enter a year 1583 or later.\n" +
                "Which year would you like to check? ");
            year = input.nextInt();
        }
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            leap = true;
        
        System.out.print("\nWhich month number would you like to check? ");
        int month = input.nextInt();
        while (month < 1 || month > 12) {
            System.out.print("\nThere are not " + month + " months in a year! Enter a number 1 to 12.\n" +
                "Which month number would you like to check? ");
            month = input.nextInt();
        }
        switch (month) {
            case 2 -> {
                if (leap)
                    daysInMonth = 29;
                else
                    daysInMonth = 28;
            }
            case 4, 6, 9, 11 -> daysInMonth = 30;
            default -> daysInMonth = 31;
        }
        
        String[] monthName = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.printf("\nThere are %d days in %s %d.\n\n", daysInMonth, monthName[month], year);
        input.close();
    }
}