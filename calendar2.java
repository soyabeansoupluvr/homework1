// 10-25-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.*;
public class calendar2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a full year number: ");
        int year = input.nextInt();
        System.out.print("Enter a month number 1 - 12: ");
        int month = input.nextInt();
        
        printCalendar(month, year);
        input.close();
    }
    
    public static void printCalendar(int month, int year) {
        System.out.println(getMonthName(month) + " " + year);
        for (int i = 0; i < 28; i++)
            System.out.print("-");
        System.out.println();
            
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        
        int startDay = getDayofWeek(1, month, year);
        int numberDaysInMonth = getdaysInMonth(month, year);
        
        for (int i = 0; i < startDay; i++)
            System.out.print("    ");
        
        for (int day = 1; day <= numberDaysInMonth; day++) {
            System.out.printf("%4d", day);
            
            if ((day + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }
    
    public static int getDayofWeek(int dayOfTheMonth, int month, int year) {
        int q = dayOfTheMonth;
        int m = month;
        if (month == 1 || month == 2) {
            m = month + 12;
            year -= 1;
        }
        int j = year / 100;
        int k = year % 100;
        
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        int dayOfTheWeek;
        
        if (h == 0)
            dayOfTheWeek = 6;
        else
            dayOfTheWeek = h - 1;
        
        return dayOfTheWeek;        
    }
    
    public static int getdaysInMonth(int month, int year){
        int daysMonth;
        switch (month) {
            case 2 -> daysMonth = isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> daysMonth = 30;
            default -> daysMonth = 31;
        }
        return daysMonth;
    }
    
    public static boolean isLeapYear(int year){
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month){
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
        }
        return monthName;
    }
}