// 09-01-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class CircleArea
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle with radius " + radius + " is " + area + ".");
        input.close();
    }
}