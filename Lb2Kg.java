

import java.util.Scanner;
public class Lb2Kg {
	public static void main(String[] args) {
        double kilos;
        double pounds;
        final double conversion = 2.2046;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pounds to convert: ");
        pounds = input.nextFloat();
        kilos = pounds / conversion;
        System.out.print(pounds + " pounds is equal to " + kilos + " kilograms.");
        input.close();
    }
}