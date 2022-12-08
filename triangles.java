// 10-02-2022 Rev. Drew Brown
// CSCI-C101 § 30187

import java.util.Scanner;
public class triangles {
    public static void main(String[] args) {
        System.out.println("Triangle Pattern Generator version 0.01\nBy Reverend Drew Brown\n");
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows would you like for your triangles?  ");
        int starDensity = input.nextInt();
        
        while (starDensity > 12 || starDensity < 1) {
            System.out.print("OK, let's try to keep this simple. Enter a number between 1 and 12.\nHow many rows would you like for your triangles?  ");
            starDensity = input.nextInt();
        }
        
        System.out.println("The bottom-left pattern:");
        for (int i = starDensity; i > 0; i--){
            for (int j = starDensity; j >= i; j--){
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println("The upper-left pattern:");
        for (int i = 1; i <= starDensity; i++){
            for (int j = starDensity; j >= i; j--){
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println("The upper-right pattern:");
        for (int i = starDensity - 1; i >= 0; i--) {
            for (int j = starDensity - 1; j >= 0; j--) {
                if (j <= i) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }                
            }
            System.out.println();
        }
        
        System.out.println("The bottom-right pattern:");
        for (int i = 1; i <= starDensity; i++) {
            for (int j = starDensity - 1; j >= 0; j--) {
                if (j >= i) {
                    System.out.print(' ');
                }
                else {
                    System.out.print('*');
                }                
            }
            System.out.println();
        }
        input.close();
    }
}