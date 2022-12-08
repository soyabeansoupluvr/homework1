// 09-13-2022 Rev. Drew Brown
// CSCI-C101 § 30187
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        boolean leap = false;
        System.out.print("Leap Year Testing Program\n-------------------------\nEnter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year < 1582)
        {
            System.out.println("The Gregorian calendar was not implemented in " + year + ".");
            System.exit(0);
        }
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            leap = true;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is NOT a leap year.");

        input.close();
    }
}