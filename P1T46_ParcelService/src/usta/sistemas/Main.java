package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 01/04/2020
        Description: This software calculate the price of the shipping according to the regions
     */
    public static void main(String[] args) {
        menu();
        Scanner keyboard = new Scanner(System.in);
        String region;
        int product, total_bill = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter the value product " + i + " in dollars");
            product = keyboard.nextInt();
            total_bill = total_bill + product;
        }
        System.out.println("Enter the region where you are (North America, South America, Central America, Europe, Asia )");
        keyboard.nextLine();
        region = keyboard.nextLine();
        total_bill = total_bill + cost_region(region);
        System.out.println("The total bill of your shipping is: " + total_bill);
    }

    public static void menu() {
        //Description: This function shows the menu of the program
        System.out.println("------------------------------------------------");
        System.out.println("               Soft_CostProducts                ");
        System.out.println("------------------------------------------------");
        System.out.println(" version 1.0 // 01/04/2020                      ");
        System.out.println("------------------------------------------------");
        System.out.println(" Created by: Jaider Pérez                       ");
        System.out.println("------------------------------------------------");
    }

    public static int cost_region(String pRegion) {
        //Description: This function determinate the region an return its shipping value
        int cost = 0;
        pRegion = pRegion.toLowerCase();
        switch (pRegion) {
            case "north america":
                cost = 11;
                break;

            case "south america":
                cost = 12;
                break;

            case "central america":
                cost = 10;
                break;
            case "europe":
                cost = 24;
                break;

            case "asia":
                cost = 27;
                break;
            default:
                System.out.println("Error: Region no valid");
        }
        return cost;
    }
}

