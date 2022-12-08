// 09-01-2022 Rev. Drew Brown
// CSCI-C101 § 30187
import java.util.Scanner;
public class TriangleArea
{
    public static void main(String[] args)
    {
        double x1, x2, x3, y1, y2, y3, s, side1, side2, side3, area;
        System.out.println("For all points, give values without parenthesis or comma.\nGive x, y coordinates of three points, one per line:");
        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        input.close();
        side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        s = (side1 + side2 + side3) / 2.0;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle described is: " + area + ".");
    }
}