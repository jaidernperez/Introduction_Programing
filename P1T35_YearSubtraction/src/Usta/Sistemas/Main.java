package Usta.Sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Jaider Pérez
       Date: 12/03/2020
       Description: This program calculate the subtraction of two year
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int year1, year2, difference;

        System.out.println("This program calculate the subtraction of two year, Enter the first birth year: ");
        year1 = keyboard.nextInt();
        System.out.println("Enter the second birth year: ");
        year2 = keyboard.nextInt();

        difference = year1 - year2;
        System.out.println("The difference between the birth years is: " + difference + " years");

    }
}
