// 09-30-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word to check if it is a palindrome: ");
        String string = input.next();
        for (int i = 0, j = (string.length() - 1); j >= i; i++, j--) {
            if (string.charAt(i) == string.charAt(j)) {}     
            else {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(string + " is a palindrome.");
        else
            System.out.println(string + " is NOT a palindrome.");
        
            input.close();
    }
}