import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int[] highTemp = new int[5];
        int[] lowTemp = new int[5];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("What is the high temperature for day %d? ", i+1);
            highTemp[i] = input.nextInt();
            System.out.printf("What is the low temperature for day %d? ", i+1);
            lowTemp[i] = input.nextInt();
        }
        
        input.close();
        
        for (int i = 0; i < lowTemp.length; i++) {
            System.out.printf("Day %d high temperature is: %d and low temperature is: %d\n", i+1, highTemp[i], lowTemp[i]);
        }
    }
}