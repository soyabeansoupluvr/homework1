/************************************************
 Universal Motors Automobile Purchase Calculator
     by Rev. Drew Brown, 
     Student #2001047582
     for CSCI-B100 §31946
     due on 10-05-2022
************************************************/

import java.util.Scanner;
public class carPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basePrice = 0, engineCost = 0, trimCost = 0, radioCost = 0, totalCost = 0;
        final int shippingCost = 500, dealerCharges = 175;
        String carModel = "", engineOption = "", trimOption = "", radioOption = "";
        
        System.out.print("Welcome to Universal Motors. Let's get you into the car of your dreams!\n" +
            "Which car are we pricing today? ");
        carModel = input.nextLine();
        System.out.print("What is the base price of the " + carModel + "? ");
        basePrice = input.nextInt();
        
        System.out.print("Engine Options:\n     S = 6 cylinder  $150\n     E = 8 cylinder  $475\n" +
			"     D = Diesel      $750\nWhich engine would you like? ");
        engineOption = input.next();
        while (engineOption.charAt(0) != 'S' && engineOption.charAt(0) != 'E' && engineOption.charAt(0) != 'D') {
            System.out.print("Invalid response, please try again: ");
            engineOption = input.next();
        }
        
        System.out.print("Interior Trim Options:\n     V = Vinyl    $50\n     C = Cloth    $225\n" +
			"     L = Leather  $800\nWhich interior trim package would you like? ");
        trimOption = input.next();
        while (trimOption.charAt(0) != 'V' && trimOption.charAt(0) != 'C' && trimOption.charAt(0) != 'L') {
            System.out.print("Invalid response, please try again: ");
            trimOption = input.next();
        }
        
        System.out.print("Radio Options:\n     R = Standard AM/FM/CD/DVD    $100\n" +
			"     G = Radio with built-in GPS  $400\nWhich radio would you like? ");
        radioOption = input.next();
        while (radioOption.charAt(0) != 'R' && radioOption.charAt(0) != 'G') {
            System.out.print("Invalid response, please try again: ");
            radioOption = input.next();
        }

        switch (engineOption) {
            case "S":
                engineOption = "6 Cylinder Engine";
                engineCost = 150;
                break;
            case "E":
                engineOption = "8 Cylinder Engine";
                engineCost = 475;
                break;
            case "D":
                engineOption = "Diesel Engine";
                engineCost = 750;
                break;
        }

        switch (trimOption) {
            case "V":
                trimOption = "Vinyl Interior";
                trimCost = 50;
                break;
            case "C":
                trimOption = "Cloth Interior";
                trimCost = 225;
                break;
            case "L":
                trimOption = "Leather Interior";
                trimCost = 800;
                break;
        }

        switch (radioOption)  {
            case "R":
                radioOption = "Standard Radio";
                radioCost = 100;
                break;
            case "G":
                radioOption = "Radio w/ GPS";
                radioCost = 400;
                break;
        }

        totalCost = basePrice + engineCost + trimCost + radioCost + shippingCost + dealerCharges;
        
        System.out.println("Your Bill of Sale");
        System.out.printf("     %-18s $%6d\n", carModel, basePrice);
        System.out.printf("     %-18s $%6d\n", engineOption, engineCost);
        System.out.printf("     %-18s $%6d\n", trimOption, trimCost);
        System.out.printf("     %-18s $%6d\n", radioOption, radioCost);
        System.out.printf("     %-18s $%6d\n", "Shipping", shippingCost);
        System.out.printf("     %-18s $%6d\n", "Dealer Fee", dealerCharges);
        System.out.printf("     %-18s $%6d\n", "TOTAL COST", totalCost);
        System.out.println("Thank you for your patronage. Don't forget that your first " +
            "5 oil changes and 2 tire rotations are included!");
        input.close();
    }
}        