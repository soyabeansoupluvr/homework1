// 08-30-2022 Rev. Drew Brown
// CSCI-C101 § 30187
import java.util.Scanner;
public class F2C
{
	public static void main(String[] args)
	{
		// variable declaration
			float degF = -40.0f, degC = -40.0f;
		// ask the user to provide input
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter temperature in degrees Fahrenheit to convert: ");
			degF = scanner.nextFloat();
		// perform conversion calculation
			degC = (degF-32.0f)*5.0f/9.0f;
		// display output
			System.out.println("      " + degF + " degrees Fahrenheit = " + degC + " degrees Celsius");
		scanner.close();
	}
}