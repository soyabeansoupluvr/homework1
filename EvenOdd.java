// 09-08-2022 Rev. Drew Brown
// CSCI-C101 § 30187
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter an integer to test: ");
        Scanner scanner = new Scanner(System.in);
        int testValue = scanner.nextInt(); // User input.
        int resultValue = testValue % 2; // Mod 2 will give us the remainder after dividing by 2.
        if (resultValue == 0) // Even numbers will have a remainder of 0.
            System.out.println(testValue + " is an even value.");
        else // Odd numbers will not have a remainder of 0.
            System.out.println(testValue + " is an odd value.");
        scanner.close();
    }
}