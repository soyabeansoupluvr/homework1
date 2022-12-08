// 10-25-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.*;

public class stdDev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements in your set? ");
        int sampleSize = input.nextInt();
        double[] sampleSet = new double[sampleSize];
        System.out.print("Enter the " + sampleSize + " values in this set: ");
        for (int i = 0; i < sampleSet.length; i++) {
            sampleSet[i] = input.nextDouble();
        }

        double mean = getMean(sampleSet);
        double sumSqDev = getSumOfSquareDevs(sampleSet, mean);
        double standardDeviation = Math.sqrt(sumSqDev / sampleSize - 1);
        System.out.printf("The standard deviation is: %.4f", standardDeviation);
        input.close();
    }
    
    public static double getMean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }
    
    public static double getSumOfSquareDevs(double[] array, double mean) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            double sqDev = Math.pow((array[i] - mean), 2);
            sum += sqDev;
        }
        return sum;
    }
}