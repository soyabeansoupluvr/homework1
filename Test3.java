import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] lowTemp = new int[5];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("What is the low temperature for day %d? ", i+1);
            lowTemp[i] = input.nextInt();
        }
        
        input.close();
        
        for (int i = 0; i < lowTemp.length; i++) {
            System.out.printf("Day %d low temperature is: %d\n", i+1, lowTemp[i]);
        }
    }
}
