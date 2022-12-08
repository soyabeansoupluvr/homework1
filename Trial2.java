import java.util.*;
public class Trial2 {
    public static void main(String[] args) {
        char[][] grid = new char[9][9];
        boolean valid = true;
        System.out.println("Enter the Sudoku grid that you would like verified:");
        getGrid(grid);
        valid = checkRows(grid, valid);
        if (valid) {
            valid = checkCols(grid, valid);
            if (valid)
                valid = checkDivs(grid, valid);
        }
        if (valid)
            System.out.println("This is a valid solution.");
        else
            System.out.println("This is NOT a valid solution.");
    }
    public static void getGrid(char[][] array) {
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
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array[i].length; j++) 
                str = str + array[i][j];
            valid = testElement(str);
            if (!valid)
                return valid;
        }
        return valid;
    }
    public static boolean checkCols(char[][] array, boolean valid) {
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array[i].length; j++)
                str = str + array[j][i];
            valid = testElement(str);
            if (!valid)
                return valid;
        }
        return valid;
    }
    public static boolean checkDivs(char[][] array, boolean valid) {
        for (int i = 0; i < array.length; i += 3) {
            for (int j = 0; j < array[i].length; j += 3) {
                String str = "";
                for (int k = i; k < (i + 3); k++) {
                    for (int l = j; l < (j + 3); l++)
                        str = str + array[k][l];
                }
                valid = testElement(str);
                if (!valid)
                    return valid;
            }
        }
        return valid;
    }
    public static boolean testElement(String str) {
        int checksum1 = 0;
        int checksum2 = 0;
        for (int i = 0; i < str.length(); i++) {
            checksum1 += str.charAt(i);
            if (str.charAt(i) < 'A' || str.charAt(i) > 'I')
                return false;
            for (char c = 'A'; c <= 'I'; c = (char)(c + 1)) {
                if (str.charAt(i) == c) {
                    checksum2 += i;
                    break;
                }
            }
        }
        if (checksum1 != 621 || checksum2 != 36)
            return false;
        return true;
    }
    public static char forceUppercase(char c) {
        if (c >= 'a' && c <= 'z')
            c = (char)(c - 'a' + 'A');
        return c;
    }
}