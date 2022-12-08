/* 
 * sudokuChecker2.java
 * 
 * version 0.2.0
 * 
 * November 22, 2022
 * 
 * This class was created by Rev. Drew Brown, a student at Indiana University Kokomo,
 * whose student number is 2001047582. It was prepared as a class assignment for
 * CSCI-C103 Computer Programming I §30187 taught by Dr. Yang Liu.
 * This file shall not be reproduced for any non-academic purposes without
 * prior authorization of the author and the instructor.
 */
 
 
import java.util.*;
public class sudokuChecker2 {
    public static void main(String[] args) {

        char[][] grid = new char[9][9];
        System.out.println("Enter the Sudoku grid that you would like verified:");
        getGrid(grid);
        
        if (isGridValid(grid)) {
            System.out.println("This is a valid solution.");
        }
        else {
            System.out.println("This is NOT a valid solution.");
        }
    }
    
    public static void getGrid(char[][] array) {
        /** 
        * Method used to get the user input to be tested.
        * @param array Destination for the user input.
        * @return null
        */
        
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                array[i][j] = forceUppercase(input.next().charAt(0));
            }
        }
        input.close();
    }
    
    public static boolean isCellValid(int row, int col, char[][] grid) {
        /**
        * Method used to check individual cells for validity.
        * @param row Row of cell in grid.
        * @param col Column of cell in grid.
        * @param grid Grid containing the cell to be checked.
        * @return true if cell meets Sudoku criteria.
        */
        
        if (grid[row][col] < 'A' || grid[row][col] > 'I') {
            return false;
        }
        
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == grid[row][col] && i != row) {
                return false;
            }
        }
        
        for (int j = 0; j < 9; j++) {
            if (grid[row][j] == grid[row][col] && j != col) {
                return false;
            }
        }
        
        int rowSectionStart = (row / 3) * 3;
        int colSectionStart = (col / 3) * 3;
        for (int i = rowSectionStart; i < rowSectionStart + 3; i++) {
            for (int j = colSectionStart; j < colSectionStart + 3; j++) {
                if (grid[i][j] == grid[row][col] && !(i == row && j == col)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static boolean isGridValid(char[][] grid) {
        /**
        * Method used to check entire grid for validity.
        * @param grid Grid to be evaluated.
        * @return true if grid is valid.
        */
        
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                if (!isCellValid(i, j, grid)) {
                    return false;
                }
            }
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