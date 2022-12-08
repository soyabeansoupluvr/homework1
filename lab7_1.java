// 10-20-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;

public class lab7_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter array length: ");
        int index = input.nextInt();
        int[] numbers = new int[index];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        
        System.out.println("The minimum is: " + min(numbers));
        System.out.println("The maximum is: " + max(numbers));
        System.out.println("The sum is: " + sum(numbers));
        input.close();
    }
    
    public static int min(int[] array){
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum)
                minimum = array[i];
        }
        return minimum;
    }
   
    public static int max(int[] array){
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum)
                maximum = array[i];
        }
        return maximum;
    }
    
    public static int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
    