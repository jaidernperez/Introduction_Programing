package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 27/03/2020
        Description: This software simulate a calculator using functions for each one of the operations
     */

    public static void main(String[] args) {
        int option, quantity;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔==========================================================╗");
        System.out.println("║--------------------Menú (Calculadora)--------------------║");
        System.out.println("║   Seleccione una opción:                                 ║");
        System.out.println("║  1.  Sumar                                               ║");
        System.out.println("║  2.  Restar                                              ║");
        System.out.println("║  3.  Multiplicar                                         ║");
        System.out.println("║  4.  Dividir                                             ║");
        System.out.println("║  5.  Salir                                               ║");
        System.out.println("╚==========================================================╝");
        System.out.println("Enter an option:");
        option = keyboard.nextInt();
        if (option > 0 && option < 6) {
            if (option == 1) {
                System.out.print("Enter the quantity of numbers to add ");
                quantity = keyboard.nextInt();
                System.out.println("The sum of the entered numbers is: " + sum(quantity));
            } else {
                if (option == 2) {
                    System.out.print("Enter the quantity of numbers to subtraction ");
                    quantity = keyboard.nextInt();
                    System.out.println("The subtraction of the entered numbers is: " + subtraction(quantity));
                } else {
                    if (option == 3) {
                        System.out.print("Enter the quantity of numbers to multiply ");
                        quantity = keyboard.nextInt();
                        System.out.println("The multiplication of the entered numbers is: " + multiply(quantity));
                    } else {
                        if (option == 4) {
                            System.out.println("The division of the entered numbers is: " + division());
                        } else {
                            System.out.println("Tank you for take part!");
                        }
                    }
                }
            }
        } else {
            System.out.println("Error, the option is out range");
        }
    }

    public static int sum(int limit) {
        Scanner keyboard = new Scanner(System.in);
        int sumatory = 0;
        for (int i = 1; i <= limit; i++) {
            int number;
            System.out.println("Enter the number " + i);
            number = keyboard.nextInt();
            sumatory = sumatory + number;
        }
        return sumatory;
    }

    public static int subtraction(int limit) {
        Scanner keyboard = new Scanner(System.in);
        int subtraction = 0;
        for (int i = 1; i <= limit; i++) {
            int number;
            System.out.println("Enter the number " + i);
            number = keyboard.nextInt();
            if (i == 1) {
                subtraction = number;
            } else {
                subtraction = subtraction - number;
            }
        }
        return subtraction;
    }

    public static int multiply(int limit) {
        Scanner keyboard = new Scanner(System.in);
        int multiply = 1;
        for (int i = 1; i <= limit; i++) {
            int number;
            System.out.println("Enter the number " + i);
            number = keyboard.nextInt();
            multiply = multiply * number;
        }
        return multiply;
    }

    public static double division() {
        Scanner keyboard = new Scanner(System.in);
        double division, dividend, divisor;
        System.out.println("Enter the dividend");
        dividend = keyboard.nextInt();
        System.out.println("Enter the divisor");
        divisor = keyboard.nextInt();
        division = dividend / divisor;
        return division;
    }
}