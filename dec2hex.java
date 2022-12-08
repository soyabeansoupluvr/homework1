// 09-22-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class dec2hex {
    public static void main(String[] args) {
        String hexNum = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number to convert: ");
        int decNum = input.nextInt();
        while (decNum < 0) {
            System.out.println("This tool is only to be used for positive integers!");
            System.out.print("Enter a decimal number to convert: ");
            decNum = input.nextInt();
        }
        do {
            if ((decNum % 16) > 9)
                hexNum = (char)(decNum % 16 - 10 + 'A') + hexNum;
            else
                hexNum = (decNum % 16) + hexNum;
            decNum = decNum / 16;
        } while (decNum != 0);
        System.out.println("Your hexadecimal number is: 0x" + hexNum);
        input.close();
    }
}