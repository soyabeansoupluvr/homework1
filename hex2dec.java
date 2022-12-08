// 09-22-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class hex2dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number to convert: 0x");
        String hexNum = input.next();
        int decNum = 0;
        int base = 1;
        for (int index = 0; index < hexNum.length(); index++) {
            if (hexNum.charAt(hexNum.length() - index - 1) > '@' && hexNum.charAt(hexNum.length() - index - 1) < 'G')
                decNum += ((10 + hexNum.charAt(hexNum.length() - index - 1) - 'A') * base);
            else if (hexNum.charAt(hexNum.length() - index - 1) > '`' && hexNum.charAt(hexNum.length() - index - 1) < 'g')
                decNum += ((10 + hexNum.charAt(hexNum.length() - index - 1) - 'a') * base);
            else
                decNum += ((hexNum.charAt(hexNum.length() - index - 1) - '0') * base);
            base = base * 16;
        }
        System.out.println("The decimal equivalent is: " + decNum);
        input.close();
    }
}