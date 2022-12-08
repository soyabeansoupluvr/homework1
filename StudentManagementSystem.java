/* 
 * StudentManagementSystem.java
 * 
 * version 0.1.0
 * 
 * December 01, 2022
 * 
 * This class was created by Rev. Drew Brown, a student at Indiana University Kokomo,
 * whose student number is 2001047582. It was prepared as a class assignment for
 * CSCI-B100 Problem Solving Using Computers §31946 taught by Dr. Md Nour Hossain.
 * This file shall not be reproduced for any non-academic purposes without
 * prior authorization of the author and the instructor.
 */
 
 
import java.util.*;

public class StudentManagementSystem {
    static final int STUDENTS = 10;
    static int stdnNumber[] = new int[STUDENTS];
    static String stdnName[] = new String[STUDENTS];
    static double stdnGPA[] = new double[STUDENTS];
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        printWelcome();
        inputData();
        System.out.println("\nThe student information as entered:");
        printData();
        bubbleSort();
        System.out.println("\nThe student information after sorting:");
        printData();
        printMinMax();
        studentLookup();
        printSalutation();
    }

    static void printWelcome() {
        // welcome message
        System.out.println(
            "---===  Welcome to the Student Management System for  ===---\n"
            + "---=== Indiana University Kokomo - School of Sciences ===---");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("\n ");
    }

    static void inputData() {
        // input user data
        for (int i = 0; i < STUDENTS; i++) {
            System.out.print("What is student " + (i + 1) + "\'s Student ID Number? ");
            stdnNumber[i] = input.nextInt();
            System.out.print("What is student number " 
                    + String.format("%04d", stdnNumber[i]) + "\'s Name? ");
            stdnName[i] = input.next();
            System.out.print("What is " + stdnName[i] +"\'s GPA? ");
            stdnGPA[i] = input.nextDouble();
        }
    }

    static void printDataHeader() {
        System.out.printf("%8s %-12s %-4s\n", "Student#", "Name", "GPA");
    }
    
    static void printData() {
        // print formatted data
        System.out.println();
        printDataHeader();
        for (int i = 0; i < STUDENTS; i++) {
            System.out.printf("%-8s %-12s %4.2f\n", 
                    String.format("%04d", stdnNumber[i]), stdnName[i], stdnGPA[i]);
        }
    }

    static void bubbleSort() {
        //sort student data by GPA from low to high
        int tempNumber;
        String tempName;
        double tempGrade;
        for (int i = 0; i < STUDENTS; i++) {
            for (int j = 0; j < (STUDENTS - i - 1); j++) {
                if (stdnGPA[j] > stdnGPA[j + 1]) {
                    tempNumber = stdnNumber[j];
                    tempName = stdnName[j];
                    tempGrade = stdnGPA[j];
                    stdnNumber[j] = stdnNumber[j + 1];
                    stdnName[j] = stdnName[j + 1];
                    stdnGPA[j] = stdnGPA[j + 1];
                    stdnNumber[j + 1] = tempNumber;
                    stdnName[j + 1] = tempName;
                    stdnGPA[j + 1] = tempGrade;
                }
            }
        }
    }

    static void printMinMax() {
        // print minimum and maximum grades' records
        System.out.println("\nThe minimum and maximum GPAs are:\n");
        printDataHeader();
        System.out.printf("%-8s %-12s %4.2f\n", 
                String.format("%04d", stdnNumber[0]), stdnName[0], stdnGPA[0]);
        System.out.printf("%-8s %-12s %4.2f\n\n", 
                String.format("%04d", stdnNumber[STUDENTS - 1]),
                stdnName[STUDENTS - 1], stdnGPA[STUDENTS - 1]);
    }

    static void studentLookup() {
        // lookup individual records upon request
        System.out.print("Would you like to also retrieve a specific record? (Y or N): ");
        String seek = input.next();
        while (Character.toUpperCase(seek.charAt(0)) == 'Y') {
            System.out.print("Enter the student number you wish to display: ");
            int query = input.nextInt();
            for (int i = 0; i < STUDENTS; i++) {
                if (stdnNumber[i] == query) {
                    System.out.println();
                    printDataHeader();
                    System.out.printf("%-8s %-12s %4.2f\n\n", 
                            String.format("%04d", stdnNumber[i]), stdnName[i], stdnGPA[i]);
                    break;
                }
                else if (i == STUDENTS - 1) {
                    System.out.println("\nStudent# " 
                            + String.format("%4d", query) + " not found.");
                }
            }
            System.out.print("\nWould you like to retrieve another record? (Y or N): ");
            seek = input.next();
        }
    }

    static void printSalutation() {
        // me just being silly -- this could have gone in the main method
        System.out.println("\nThank you. Until next time, have a great one!");
    }
}