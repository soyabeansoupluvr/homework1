// 10-05-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;

public class toTitleCase {

    public static void main (String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("String to Title Case Formatter version 1.04\n" + "By Reverend Drew Brown\n\nEnter a string to format:");
        String inputString = input.nextLine();
        String outputString = "";
        Scanner output = new Scanner(inputString);

        for (String temp = ""; output.hasNext();) {
            temp = output.next() + " ";
            String modify = "";

            for (int i = temp.length() - 1; i > 0; i--) {
                if (temp.charAt(i) >= 'A' && temp.charAt(i) <= 'Z')
                    modify = (char)(temp.charAt(i) + 32) + modify;
                else
                    modify = temp.charAt(i) + modify;
            }

            if (temp.charAt(0) >= 'a' && temp.charAt(0) <= 'z') 
                modify = (char)(temp.charAt(0) - 'a' + 'A') + modify;
            else
                modify = temp.charAt(0) + modify;
            
            outputString = outputString + modify;
        }

        System.out.println(outputString);
        input.close();
        output.close();
    }
}