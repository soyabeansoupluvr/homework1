// 10-24-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class calendar {
    public static void main(String[] args){
        String[] monthName = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        
        System.out.println("Calendar Generator v. 0.6 by Rev. Drew Brown" +
            "\n---------------------------------------------\n");
        
        System.out.print("Which year? ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        while (year < 1582) {
            System.out.print("The Gregorian calendar was not implemented in " + year + ".\n" +
                "Try a year 1583 or later. Which year? ");
            year = input.nextInt();
        }
        
        System.out.print("Which month number (1 to 12)? ");
        int month = input.nextInt();
        while (month < 1 || month > 12) {
            System.out.print("\nThere are not " + month + " months in a year! Enter a number 1 to 12.\n" +
                "Which month number (1 to 12)? ");
            month = input.nextInt();
        }
        
        System.out.println("\n              " + monthName[month] + " " + year +
        	"\n-------------------------------------------" +
            "\n  MON   TUE   WED   THU   FRI   SAT   SUN");
        
        int position = 0;
        
        for (int i = 0; i < monthStart(month, year); i++){
            System.out.print("      ");
            position++;
        }
        
        for (int i = 1; i <= daysInMonth(month, year); i++){
            System.out.printf("%5s ", i);
            position++;
            if (position % 7 == 0)
                System.out.println();
        }
        
        System.out.println("\n");
        input.close();
    }
    
    public static int monthStart(int month, int year){
        /*     This comment's text was provided in the assignment by Dr. Yang Liu:
            Zeller's congruence algorithm to calculate the day of the week:
            h = (q + 26(m+1)/10 + k + k/4 + j/4 + 5j) % 7
        */
        if (month == 1 || month == 2) {
            year--;
            month += 12;
        }
        int q = 6; // first day of the month + 5 day bias to make Monday == 0
        int m = month;
        int k = year % 100;
        int j = year / 100;
        
        int h = q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j;
        h %= 7;
        return h;
    }
    
    public static int daysInMonth(int month, int year){
        int days; 
        switch (month) {
            case 2 -> days = isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> days = 30;
            default -> days = 31;
        }
        return days;
    }
    
    public static boolean isLeapYear(int year){
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

}