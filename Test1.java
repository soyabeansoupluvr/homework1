import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int lowTemp1;
        int lowTemp2;
        int lowTemp3;
        int lowTemp4;
        int lowTemp5;
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the low temperature for day 1? ");
        lowTemp1 = input.nextInt();
        System.out.print("What is the low temperature for day 2? ");
        lowTemp2 = input.nextInt();
        System.out.print("What is the low temperature for day 3? ");
        lowTemp3 = input.nextInt();
        System.out.print("What is the low temperature for day 4? ");
        lowTemp4 = input.nextInt();
        System.out.print("What is the low temperature for day 5? ");
        lowTemp5 = input.nextInt();
        
        input.close();
        
        System.out.println("Day 1 low temperature is: " + lowTemp1);
        System.out.println("Day 2 low temperature is: " + lowTemp2);
        System.out.println("Day 3 low temperature is: " + lowTemp3);
        System.out.println("Day 4 low temperature is: " + lowTemp4);
        System.out.println("Day 5 low temperature is: " + lowTemp5);
    }
}