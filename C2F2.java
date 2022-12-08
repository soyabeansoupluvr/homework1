// 08-30-2022 Rev. Drew Brown
// CSCI-C101 § 30187
import java.util.Scanner;
public class C2F2{
    public static void main(String[] args)
    {
        // variable declaration and initial assignment
            double degF = -40.0, degC = -40.0;
        // ask the user to provide input
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter temperature in degrees Celsius to convert: ");
			degC = scanner.nextDouble();
			// perform conversion calculation
			degF = degC * 1.8 + 32.0;
		// display the formatted output
			System.out.printf("%s%.2f%s%.2f%s%n","        ", degC, " degrees Celsius = ", degF, " degrees Fahrenheit");
			scanner.close();
	}
}