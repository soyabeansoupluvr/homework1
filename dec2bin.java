// 09-20-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class dec2bin {
    public static void main(String[] args) {
        String binNum = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number to convert: ");
        int decNum = input.nextInt();
        while (decNum < 0) {
            System.out.println("This tool is only to be used for positive integers!");
            System.out.print("Enter a decimal number to convert: ");
            decNum = input.nextInt();
        }
        do {
            binNum = (decNum % 2) + binNum;
            decNum = decNum / 2;
        } while (decNum != 0);
        System.out.println("Your binary number is: " + binNum);
        input.close();
    }
}
        