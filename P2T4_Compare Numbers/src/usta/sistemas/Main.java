package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 14/04/2020
        Description: This software compare two numbers
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        menu();
        System.out.print("Enter the first number: ");
        var number1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        var number2 = keyboard.nextInt();

        var sooth = compareNumbers(number1, number2);
        if (sooth)
            System.out.println("The two numbers is same");
        else
            System.out.println("The two numbers aren't same");
    }

    public static void menu() {
        System.out.println("╔===================================================╗");
        System.out.println("║--------------------SoftCompare--------------------║");
        System.out.println("║===================================================║");
        System.out.println("║  version: 1.0     Date: 14/04/2020                ║");
        System.out.println("║===================================================║");
        System.out.println("║              Created by: Jaider Pérez             ║");
        System.out.println("╚===================================================╝");
        System.out.println("Enter two numbers to compare: ");
    }

    public static boolean compareNumbers(int p_number1, int p_number2) {
        // Description: This function compare two numbers
        boolean var;
        var = p_number1 == p_number2;
        return var;
    }
}
