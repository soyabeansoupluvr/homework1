/* 
 * readWrite.java
 * 
 * version 0.1.0
 * 
 * November 8, 2022
 * 
 * This class was created by Rev. Drew Brown, a student at Indiana University Kokomo,
 * whose student number is 2001047582. It was prepared as a class assignment for
 * CSCI-C103 Computer Programming I §30187 taught by Dr. Yang Liu.
 * This file shall not be reproduced for any non-academic purposes without
 * prior authorization of the author and the instructor.
 */
 
 
import java.util.*;
import java.io.*;

public class readWrite {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int inSize = input.nextInt();
        input.close();
        double[] numbers = new double[inSize];
        
        Random rd = new Random();
        FileWriter fw = new FileWriter(new File("data.txt"));
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextDouble();
            fw.write(String.valueOf(numbers[i]));
            fw.write("\n");
        }
        fw.close();
        
        input = new Scanner(new File ("data.txt"));
        
        ArrayList<Double> list1 = new ArrayList<>();
        
        while (input.hasNext()) {
            list1.add(input.nextDouble());
        }
        input.close();
        
        double sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
        }
        
        System.out.printf("The sum of the array is: %.2f\n", sum);

    }
}