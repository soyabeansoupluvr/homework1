/* 
 * matrixMultiply.java
 * 
 * version 0.1.0
 * 
 * November 3, 2022
 * 
 * This class was created by Rev. Drew Brown, a student at Indiana University Kokomo,
 * whose student number is 2001047582. It was prepared as a class assignment for
 * CSCI-C103 Computer Programming I §30187 taught by Dr. Yang Liu. 
 * This file shall not be reproduced for any non-academic purposes without
 * prior authorization of the author and the instructor.
 *
 */


import java.util.*;

public class matrixMultiply {
    public static void printArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(" %4d ", array[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many rows in matrix A? ");
        int numRowsA = input.nextInt();
        System.out.print("How many columns in matrix A? ");
        int numColsA = input.nextInt();
        
        int[][] matrixA = new int[numRowsA][numColsA];
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsA; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.print("How many rows in matrix B? ");
        int numRowsB = input.nextInt();
        System.out.print("How many columns in matrix B? ");
        int numColsB = input.nextInt();
        
        int[][] matrixB = new int[numRowsB][numColsB];
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < numRowsB; i++) {
            for (int j = 0; j < numColsB; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }
        
        input.close();
        
        if (numColsA != numRowsB) {
            System.out.println("These matrices cannot be multiplied.");
        }
        else {
            int[][] matrixC = new int[numRowsA][numColsB];
            for (int i = 0; i < numRowsA; i++) {
                for (int j = 0; j < numColsB; j++) {
                    int sum = 0;
                    for (int k = 0; k < numColsA; k++) {
                        sum += matrixA[i][k] * matrixB[k][j];
                    }
                    matrixC[i][j] = sum;
                }
            }
            System.out.println("Product of Matrix A and Matrix B:");
            printArray(matrixC);
        }
    }
}