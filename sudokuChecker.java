/* 
 * sudokuChecker.java
 * 
 * version 0.1.1
 * 
 * November 4, 2022
 * 
 * This class was created by Rev. Drew Brown, a student at Indiana University Kokomo,
 * whose student number is 2001047582. It was prepared as a class assignment for
 * CSCI-C103 Computer Programming I §30187 taught by Dr. Yang Liu.
 * This file shall not be reproduced for any non-academic purposes without
 * prior authorization of the author and the instructor.
 */
 
 
import java.util.*;
public class sudokuChecker {
    public static void main(String[] args) {

        char[][] grid = new char[9][9];
        boolean valid = true;
        System.out.println("Enter the Sudoku grid that you would like verified:");
        getGrid(grid);
        valid = checkRows(grid, valid);
        if (valid) {
            valid = checkCols(grid, valid);
            if (valid) {
                valid = checkDivs(grid, valid);
            }
        }
        if (valid) {
            System.out.println("This is a valid solution.");
        }
        else {
            System.out.println("This is NOT a valid solution.");
        }

    }
    
    public static void getGrid(char[][] array) {
        /** 
        * Method used to get the user input to be tested.
        * @param input Scanner to obtain user input.
        * @param array Destination for the user input.
        * @return null
        */
        
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                String temp = input.next();
                array[i][j] = forceUppercase(temp.charAt(0));
            }
        }
        input.close();
    }
    
    public static boolean checkRows(char[][] array, boolean valid) {
        /** 
        * Method used to check each row of the grid.
        * @param array Grid to be checked.
        * @param valid Used as a test variable.
        * @param str Temporary string to pass for verification.
        * @return valid Test result.
        */
        
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array[i].length; j++) {
                str = str + array[i][j];
            }
            valid = testElement(str);
            if (!valid) {
                return valid;
            }
        }
        return valid;
    }
    
    public static boolean checkCols(char[][] array, boolean valid) {
        /** 
        * Method used to check each column of the grid.
        * @param array Grid to be checked.
        * @param valid Used as a test variable.
        * @param str Temporary string to pass for verification.
        * @return valid Test result.
        */
        
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array[i].length; j++) {
                str = str + array[j][i];
            }
            valid = testElement(str);
            if (!valid) {
                return valid;
            }
        }
        return valid;
    }
    
    public static boolean checkDivs(char[][] array, boolean valid) {
        /** 
        * Method used to check each 3x3 division of the grid.
        * @param array Grid to be checked.
        * @param valid Used as a test variable.
        * @param str Temporary string to pass for verification.
        * @return valid Test result.
        */
        
        for (int i = 0; i < array.length; i += 3) {
            for (int j = 0; j < array[i].length; j += 3) {
                String str = "";
                for (int k = i; k < (i + 3); k++) {
                    for (int l = j; l < (j + 3); l++) {
                        str = str + array[k][l];
                    }
                }
                valid = testElement(str);
                if (!valid) {
                    return valid;
                }
            }
        }
        return valid;
    }
    
    public static boolean testElement(String str) {
        /**
        * Method used to test each individual element of the grid.
        * @param str String input for verification.
        * @param checksum1 A valid element will add up to 621.
        * @param checksum2 A valid element will add up to 36.
        * @return true for a valid element.
        */
        
        int checksum1 = 0;
        int checksum2 = 0;
        for (int i = 0; i < str.length(); i++) {
            checksum1 += str.charAt(i);
            if (str.charAt(i) < 'A' || str.charAt(i) > 'I') {
                return false;
            }
            for (char c = 'A'; c <= 'I'; c = (char)(c + 1)) {
                if (str.charAt(i) == c) {
                    checksum2 += i;
                    break;
                }
            }
        }
        if (checksum1 != 621 || checksum2 != 36) {
            return false;
        }
        return true;
    }
    
    public static char forceUppercase(char c) {
        /**
        * Method used to force all characters to uppercase.
        * @param c Character to check/modify.
        * @return c Uppercase character for character entered.
        */
        
        if (c >= 'a' && c <= 'z') {
            c = (char)(c - 'a' + 'A');
        }
        return c;
    }
}