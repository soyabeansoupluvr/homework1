// 09-29-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class longestPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This utility will tell you what the longest common prefix of two strings is.");
        String commonPrefix = "";
        System.out.print("Enter your first string:  ");
        String string1 = input.nextLine();
        System.out.print("Enter your second string: ");
        String string2 = input.nextLine();
        for (int i = 0; i < string1.length() && i < string2.length() && string1.charAt(i) == string2.charAt(i); i++)
            commonPrefix = commonPrefix + string1.charAt(i);
        if (commonPrefix != "")
            System.out.printf("The longest common prefix of %s and %s is %s.", string1, string2, commonPrefix);
        else
            System.out.printf("There is no common prefix for %s and %s.", string1, string2);
        
            input.close();
    }
}