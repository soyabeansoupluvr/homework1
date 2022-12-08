/* 
 * Weather.cpp
 * 
 * version 0.1.2
 * 
 * October 31, 2022
 * 
 * This project was created by Rev. Drew Brown, a student at Indiana University Kokomo,
 * whose student number is 2001047582. It was prepared as a class assignment for
 * CSCI-B100 Problem Solving Using Computers §31946 taught by Dr. Md Nour Hossain.
 * This file shall not be reproduced for any non-academic purposes without
 * prior authorization of the author and the instructor.
 */


#include <iostream>
#include <iomanip>
using namespace std;

int main(void) {
    cout << "Indiana University Kokomo Weather Network" << endl;
    cout << "Temperature Tracking and Analysis Tool" << endl;
    cout << "How many days are we tracking? (3 thru 10): ";
    int numDays;
    cin >> numDays;
    while (numDays < 3 || numDays > 10) {
        cout << "Error: This tool is to be used for 3 days minimum and 10 days maximum." << endl;
        cout << "How many days are we tracking? (3 thru 10): ";
        cin >> numDays;
    }
    float tempHigh[numDays];
    float tempLow[numDays];
    float avgHigh;
    float avgLow;
    for (int i = 0; i < numDays; i++) {
        cout << "High for Day " << (i+1) << ": ";
        cin >> tempHigh[i];
        cout << "Low for Day " << (i+1) << ": ";
        cin >> tempLow[i];
        avgHigh += tempHigh[i];
        avgLow += tempLow[i];
    }
    avgHigh /= numDays;
    avgLow /= numDays;
    cout << "\n" << setw(3) << "Day" << setw(8) << "High" << setw(8) << "Low" << endl;
    for ( int i = 0; i < numDays; i++) {
        cout << setw(3) << (i+1) << setw(8) << setprecision(3) << tempHigh[i]
            << setw(8) << setprecision(3) << tempLow[i] << endl;
    }
    cout << "\nAverage High: " << setprecision(3) << avgHigh << endl;
    cout << "Average Low: " << setprecision(3) << avgLow << endl;
    cout << "\nTask completed successfully!" << endl;
    return 0;
}