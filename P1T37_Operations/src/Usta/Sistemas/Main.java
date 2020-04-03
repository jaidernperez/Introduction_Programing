package Usta.Sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Jaider Pérez
       Date: 12/03/2020
       Description: This software makes the four operations between four numbers
     */
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int n1, n2, resultInteger=0;
        double n3, n4, resultDouble=0;

        System.out.println("This program realize many math operations between numbers, enter the first integer number: ");
        n1=keyboard.nextInt();
        System.out.println("Enter the second integer number:");
        n2=keyboard.nextInt();
        System.out.println("Enter the first decimal number");
        n3=keyboard.nextDouble();
        System.out.println("Enter the second decimal number");
        n4=keyboard.nextDouble();

        resultInteger=n1+n2;
        System.out.println("The sum of the integer number is: "+ resultInteger);

        resultDouble=n3+n4;
        System.out.println("The sum of the decimal numbers is: "+resultDouble);

        resultInteger=n1-n2;
        System.out.println("The subtraction of the integer number is: "+resultInteger);

        resultDouble=n3-n4;
        System.out.println("The subtraction of the decimal numbers is: "+resultDouble);

        resultInteger=n1*n2;
        System.out.println("The multiplication of the integer number is: "+resultInteger);

        resultDouble=n3*n4;
        System.out.println("The multiplication of the decimal numbers is: "+resultDouble);

        resultInteger=n1/n2;
        System.out.println("The division of the integer number is: "+resultInteger);

        resultDouble=n3/n4;
        System.out.println("The division of the decimal numbers is: "+resultDouble);

    }
}
