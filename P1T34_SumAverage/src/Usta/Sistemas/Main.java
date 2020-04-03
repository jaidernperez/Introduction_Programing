package Usta.Sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Jaider Pérez
       Date: 12/03/2020
       Description: This software sum three variables and calculate its average
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1, n2, n3, sum;
        double average;
        
        System.out.println("This programs calculate the sum and the average of three numbers, Enter the first number: ");
        n1 = keyboard.nextInt();
        System.out.println("Enter the second number: ");
        n2 = keyboard.nextInt();
        System.out.println("Enter the third number");
        n3 = keyboard.nextInt();

        sum = n1 + n2 + n3;
        average = sum / 3;
        System.out.println("The sum of this numbers is: " + sum + " and the average is: " + average);
    }
}
