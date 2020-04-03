package com.company;

import java.util.Scanner;

public class Main {
    /* Author: Jaider Pérez
       Date: 12/03/2020
       Description: This program input two variables and add */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1, n2, result;

        System.out.println("This software adds two variables, Enter the first variable: ");
        n1 = keyboard.nextInt();
        System.out.println("Enter the second variable");
        n2 = keyboard.nextInt();

        result = n1 + n2;
        System.out.println("The result of this operation is: " + result);
    }
}
