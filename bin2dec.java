// 09-20-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class bin2dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number to convert: ");
        String binNum = input.next();
        int decNum = 0;
        int base = 1;
        int index = 0;
        while (index < binNum.length()) {
            decNum = decNum + (binNum.charAt(binNum.length() - index - 1) - '0') * base;
            base = base * 2;
            index++;
        }
        System.out.println("The decimal equivalent is: " + decNum);
        input.close();
    }
}