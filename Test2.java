import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] lowTemp = new int[5];
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the low temperature for day 1? ");
        lowTemp[0] = input.nextInt();
        System.out.print("What is the low temperature for day 2? ");
        lowTemp[1] = input.nextInt();
        System.out.print("What is the low temperature for day 3? ");
        lowTemp[2] = input.nextInt();
        System.out.print("What is the low temperature for day 4? ");
        lowTemp[3] = input.nextInt();
        System.out.print("What is the low temperature for day 5? ");
        lowTemp[4] = input.nextInt();
        
        input.close();
        
        System.out.println("Day 1 low temperature is: " + lowTemp[0]);
        System.out.println("Day 2 low temperature is: " + lowTemp[1]);
        System.out.println("Day 3 low temperature is: " + lowTemp[2]);
        System.out.println("Day 4 low temperature is: " + lowTemp[3]);
        System.out.println("Day 5 low temperature is: " + lowTemp[4]);
    }
}