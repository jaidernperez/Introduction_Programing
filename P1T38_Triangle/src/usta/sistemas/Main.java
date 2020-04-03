package usta.sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Jaider Pérez
        Date: 19/03/2020
        Description: This program calculates the hypotenuse of a triangle
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double cateto1, cateto2, hypotenuse;
        System.out.println("Input the first leg in cm");
        cateto1 = keyboard.nextDouble();
        System.out.println("Input the second leg in cm");
        cateto2 = keyboard.nextDouble();

        hypotenuse = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("The hypotenuse of this triangle is: " + hypotenuse + " cm");
    }
}
