// 08-30-2022 Rev. Drew Brown
// CSCI-C101 § 30187
import java.util.Scanner;
public class C2F
{
	public static void main(String[] args)
	{
		// variable declaration
			float degF = -40.0f, degC = -40.0f;
		// ask the user to provide input
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter temperature in degrees Celsius to convert: ");
			degC = scanner.nextFloat();
		// perform conversion calculation
			degF = degC*1.8f+32.0f;
		// display output
			System.out.println("      " + degC + " degrees Celsius = " + degF + " degrees Fahrenheit");
		scanner.close();
	}
}