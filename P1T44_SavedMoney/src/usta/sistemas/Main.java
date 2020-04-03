package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 26/03/2020
        Description: This program calculate the money that a person save for a year if each week save fifteen percent of the salary
     */
    public static void main(String[] args) {
        menu();
        Scanner keyboard = new Scanner(System.in);
        int salary;
        System.out.println("Enter your monthly salary");
        salary = keyboard.nextInt();
        System.out.println("The money saved during the year is: " + annualSavings(salary));
    }

    public static void menu() {
        // Description: Show the menu of the program
        System.out.println("--------------------------------------------------------------");
        System.out.println("                        SoftMoney                             ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("                Version 1.0   01-04-2020                      ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("This program calculate the money that a person save for a year");
        System.out.println("--------------------------------------------------------------");
        System.out.println("                  Created by: Jaider Pérez                    ");
        System.out.println("--------------------------------------------------------------");
    }

    public static double annualSavings(double pSalary) {
        //Description: this function calculate the saved money yn the year
        double saving;
        saving = 48 * (pSalary  * 0.15);
        return saving;
    }
}
